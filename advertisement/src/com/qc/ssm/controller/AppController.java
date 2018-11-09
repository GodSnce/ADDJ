package com.qc.ssm.controller;

import com.qc.ssm.po.Appconfig;
import com.qc.ssm.po.Appdata;
import com.qc.ssm.request.HttpRequest;
import com.qc.ssm.service.AppService;
import com.qc.ssm.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 应用对接
 */
@Controller
public class AppController {

    @Autowired
    private AppService appService;


    /**
     * 接收渠道点击数据并上报给广告主
     * @param request
     * @param imei
     * @param idfa
     * @param cip
     * @param ctime
     * @param channel
     * @return
     *
     * 本地测试连接
     * http://localhost:8080/appClick.do?appid=13212313&idfa=asdfasdf&cip=1.1.1.1&channel=005213
     */
    @RequestMapping("/appClick")
    @ResponseBody
    public String appClick(HttpServletRequest request,
                           @RequestParam(value = "idfa",required = false,defaultValue = "") String idfa,
                           @RequestParam(value = "imei",required = false,defaultValue = "") String imei,
                           @RequestParam(value = "cip",required = false,defaultValue = "") String cip,
                           @RequestParam(value = "ctime",required = false,defaultValue = "") String ctime,
                           @RequestParam(value = "channel",required = false,defaultValue = "") String channel,
                           @RequestParam(value = "callback",required = false,defaultValue = "") String callback,
                           String appid) throws UnsupportedEncodingException {

        Appdata appdata = new Appdata();
        appdata.setAppid(Integer.valueOf(appid));
        appdata.setIdfa(idfa);
        appdata.setImei(imei);
        appdata.setStatus(1);
        appdata.setCip(cip);
        appdata.setCtime(TimeUtil.getDateN());
        appdata.setChannel(channel);
        appdata.setCallback(callback);

        //接收到的点击数据存入数据库
        appService.insert(appdata);

        //根据appid查找status为1的广告主url(1为广告主)
        List<Appconfig> list = appService.findAppConfigByAppidAndStatus(appid,"1");

        String url = "";
        String param = "";
        //回调链接
        String callback_ggz = "";

        if (list.size() > 0){
            url = list.get(0).getUrl();
            param = list.get(0).getParam();
            callback_ggz = list.get(0).getCallback();

            String callback_new = "";

            if (param.contains("APPID")){
                param = param.replace("APPID",appid);
            }
            //判断参数中是否包含并替换参数值
            if (param.contains("IDFA")){
                param = param.replace("IDFA",idfa);
            }
            if (param.contains("IMEI")){
                param = param.replace("IMEI",imei);
            }
            if (param.contains("CIP")){
                param = param.replace("CIP",cip);
            }
            if (param.contains("CTIME")){
                param = param.replace("CTIME",String.valueOf(TimeUtil.getDateNum()));
            }
            if (param.contains("CALLBACK")){
                callback_ggz = callback_ggz.replace("APPID",appid);
                if (callback_ggz.contains("IDFA")){
                    callback_ggz = callback_ggz.replace("IDFA",idfa);
                }
                if (callback_ggz.contains("IMEI")){
                    callback_ggz = callback_ggz.replace("IMEI",imei);
                }
                if (callback_ggz.contains("CHANNEL")){
                    callback_ggz = callback_ggz.replace("CHANNEL",channel);
                }
//                System.out.println(callback_ggz);
                callback_ggz = URLEncoder.encode(callback_ggz,"utf-8");
//                callback_ggz = URLEncoder.encode(callback_ggz);
                param = param.replace("CALLBACK",callback_ggz);
            }
        }

        String result = HttpRequest.sendGet(url, param);

//        String res = new String(HttpRequest.sendGet(url, param).getBytes(),"UTF-8");

        return result;

    }

    /**
     * 接收广告主激活回调，并回调给渠道
     * @param request
     * @param appid
     * @param idfa
     * @param regip
     * @param regtime
     * @param channel
     * @return
     */
    @RequestMapping("/appActivation")
    @ResponseBody
    public String appActivation(HttpServletRequest request,
                                @RequestParam(value = "appid",required = false,defaultValue = "") String appid,
                                @RequestParam(value = "idfa",required = false,defaultValue = "") String idfa,
                                @RequestParam(value = "regip",required = false,defaultValue = "") String regip,
                                @RequestParam(value = "regtime",required = false,defaultValue = "") String regtime,
                                @RequestParam(value = "channel",required = false,defaultValue = "") String channel){

        //将数据的状态变为2激活状态--添加当前时间为激活时间
        appService.updateStatusByAppidAndIdfa(appid, idfa, 2);

        //根据appid和channel查找status为1的渠道url
        List<Appconfig> list = appService.findAppConfigByAppidStaChan(appid,"1",channel);

        List<Appdata> list2 = appService.findByAppidIdfa(appid,idfa);
        //扣量
        int kouliang = 100;

        if (list.size() > 0){
            kouliang = list.get(0).getKouliang();
        }

        String callback = "";
        if (list2.size() > 0){
            callback = list2.get(0).getCallback();
        }
        //扣量
        Random r = new Random();
        int i = r.nextInt(100);

        String result = "";

        if (kouliang >= i){
            result = HttpRequest.sendGet_callback(callback);
        }else {
            //将扣量状态改为3
            appService.updateStatusByAppidAndIdfa(appid, idfa, 3);
        }

        return result;
    }

    /**
     * 快速任务给渠道扣量
     * @param request
     * @param appid
     * @param idfa
     * @param regip
     * @param regtime
     * @param channel
     * @return
     */
    @RequestMapping("/appActivationKS")
    @ResponseBody
    public Map appActivationKS(HttpServletRequest request,
                                @RequestParam(value = "appid",required = false,defaultValue = "") String appid,
                                @RequestParam(value = "idfa",required = false,defaultValue = "") String idfa,
                                @RequestParam(value = "regip",required = false,defaultValue = "") String regip,
                                @RequestParam(value = "regtime",required = false,defaultValue = "") String regtime,
                                @RequestParam(value = "channel",required = false,defaultValue = "") String channel) throws InterruptedException {



        //根据appid查找status为1的渠道url
        List<Appconfig> list = appService.findAppConfigByAppidStaChan(appid,"1",channel);

        List<Appdata> list2 = appService.findByAppidIdfa(appid,idfa);
        //扣量
        int kouliang = 100;

        if (list.size() > 0){
            kouliang = list.get(0).getKouliang();
        }

        String callback = "";
        if (list2.size() > 0){
            callback = list2.get(0).getCallback();
        }
        //扣量
        Random r = new Random();
        int i = r.nextInt(100);

        String result = "";

        if (kouliang >= i){
            appService.updateStatusByAppidAndIdfa(appid, idfa, 2);
            Thread.sleep(5000);
            result = HttpRequest.sendGet_callback(callback);
        }

        Map map = new HashMap();
        map.put("message","接收成功!");
        map.put("success",true);
//        {"message":"接收成功！","success":true}
        return map;
    }


    /**
     * 上报激活接口
     * @param request
     * @param idfa
     * @param cip
     * @param ctime
     * @param channel
     * @param appid
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping("/appReport")
    @ResponseBody
    public String appReport(HttpServletRequest request,
                           @RequestParam(value = "idfa",required = false,defaultValue = "") String idfa,
                           @RequestParam(value = "cip",required = false,defaultValue = "") String cip,
                           @RequestParam(value = "ctime",required = false,defaultValue = "") String ctime,
                           @RequestParam(value = "channel",required = false,defaultValue = "") String channel,
                           String appid) throws UnsupportedEncodingException {


        //将数据的状态变为2激活状态--添加当前时间为激活时间
        appService.updateStatusByAppidAndIdfa(appid, idfa, 2);


        //根据appid查找status为1的广告主url(5为广告主上报激活接口)
        List<Appconfig> list = appService.findAppConfigByAppidAndStatus(appid,"5");

        String url = "";
        String param = "";


        if (list.size() > 0){
            url = list.get(0).getUrl();
            param = list.get(0).getParam();

            if (param.contains("APPID")){
                param = param.replace("APPID",appid);
            }
            //判断参数中是否包含并替换参数值
            if (param.contains("IDFA")){
                param = param.replace("IDFA",idfa);
            }
            if (param.contains("CIP")){
                param = param.replace("CIP",cip);
            }
            if (param.contains("CTIME")){
                param = param.replace("CTIME",String.valueOf(TimeUtil.getDateNum()));
            }

        }

        String result = HttpRequest.sendGet(url, param);

//        String res = new String(HttpRequest.sendGet(url, param).getBytes(),"UTF-8");

        return result;

    }
}
