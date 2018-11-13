package com.qc.ssm.controller;

import com.qc.ssm.po.Gconfig;
import com.qc.ssm.po.Gdata;
import com.qc.ssm.request.HttpRequest;
import com.qc.ssm.service.GService;
import com.qc.ssm.utils.TimeUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Random;

@Controller
public class GController {

    private static Logger logger = Logger.getLogger(GController.class);

    @Autowired
    private GService gService;

    //接收渠道的点击并发给广告主
    //本地测试地址http://localhost:8080/gClick.do?gid=123456&idfa=asdfasdf&imei=&status=1&media=ss&cip=&ctime=&tagid=%E8%8B%B9%E6%9E%9C&channel=12
    @RequestMapping("/gClick")
    @ResponseBody
    public String gClick(HttpServletRequest request, Gdata gdata){

        try {
            //接收到的数据存入数据库
            gService.insert(gdata);
        }catch (Exception e){
            logger.error("插入数据失败");
        }



        //根据gid查找state为1的广告主url
        List<Gconfig> list = gService.findGconfigByGid(gdata.getGid(),"1");
        String url = list.get(0).getUrl();
        String param = list.get(0).getParam();

        //替换参数
        //游戏id
        param = param.replace("GID",gdata.getGid().toString());
        //设备唯一标识idfa
        param = param.replace("IDFA",gdata.getIdfa());
        //点击时间
        param = param.replace("CTIME",gdata.getCtime().toString());
        //点击ip
        param = param.replace("CIP",gdata.getCip());

        String result = url + param;
//        System.out.println("===============================" + result);

        //向广告主发送get请求
//        String result = HttpRequest.sendGet(url, param);
        return result;
    }

    //接受广告主的激活回调并发给渠道
    @RequestMapping("/gActivation")
    @ResponseBody
    public String gActivation(HttpServletRequest request,String gid,String idfa,String imei,String regtime,String regip){
//        http://localhost:8080/gActivation.do?gid=1250294840&idfa=asdfasdf&imei=&regip=10.10.2.3&regtime=3241234234

        //根据gid和idfa更新激活状态为2
        boolean b = gService.updateStatusByGid(Integer.valueOf(gid),idfa,2);

        //将激活数据转发给渠道
        //根据gid，state和渠道号
        List<Gconfig> list= gService.findGconfigByGidAndState(Integer.valueOf(gid),2);

        String url = list.get(0).getUrl();
        String param = list.get(0).getParam();



        param = param.replace("IDFA",idfa);
        param = param.replace("GID",gid);
        param = param.replace("IP",regip);

//        System.out.println("====================" + url + param);

        String result = HttpRequest.sendGet(url, param);

        return result;
    }


    /**
     * 塔肯渠道对接点击
     * 接收渠道的点击并发给广告主
     * 本地测试地址http://localhost:8080/gClick/qudao1.do?gid=123456&idfa=asdfasdf&cip=19.14.145.23&ctime=1522373928930&channel=12
     * @param request
     * @param gid
     * @param idfa
     * @param ctime
     * @param cip
     * @param channel   渠道号
     * @return
     */
    @RequestMapping("/gClick/taken01")
    @ResponseBody
    public String taken01(HttpServletRequest request, String gid,String idfa,String ctime,String cip,String channel){

        Gdata gdata = new Gdata();
        gdata.setGid(Integer.valueOf(gid));
        gdata.setIdfa(idfa);
        gdata.setCtime(TimeUtil.getDate(Long.valueOf(ctime)));
        gdata.setCip(cip);
        gdata.setChannel(channel);
        gdata.setStatus(1);

        //接收到的数据存入数据库
        gService.insert(gdata);

        //根据gid查找state为1的广告主url
        //https://collect.rastargame.com/ad/Langdie/clickData/cchid/222/appid/100198/mdid/289091/?gid={gid}&idfa={idfa}&clktime={clktime}&ip={ip}
        List<Gconfig> list = gService.findGconfigByGid(gdata.getGid(),"1");
        String url = list.get(0).getUrl();
        String param = list.get(0).getParam();

        //替换参数
        //游戏id
        param = param.replace("GID",gid);
        //设备唯一标识idfa
        param = param.replace("IDFA",idfa);
        //点击时间
        param = param.replace("CTIME",ctime.substring(0,ctime.length()-3));
        //点击ip
        param = param.replace("CIP",cip);

//        String result = url + param;
//        System.out.println("===============================" + result);

        //向广告主发送get请求
        String result = HttpRequest.sendGet(url, param);
        return result;
    }

    /**
     * 塔肯渠道对接点击拼多多
     * 接收渠道的点击并发给广告主
     * 本地测试地址http://localhost:8080/gClick/qudao1.do?gid=123456&idfa=asdfasdf&cip=19.14.145.23&ctime=1522373928930&channel=12
     * @param request
     * @param gid
     * @param idfa
     * @param ctime
     * @param cip
     * @param channel   渠道号
     * @return
     */
    @RequestMapping("/gClick/taken02")
    @ResponseBody
    public String taken02(HttpServletRequest request, String gid,String idfa,String ctime,String cip,String channel) throws UnsupportedEncodingException {

        String urls = "http://47.95.244.199/ad/gActivation/pinduoduo.do?gid=GID&idfa=IDFA";
        urls = urls.replace("GID",gid);
        urls = urls.replace("IDFA",idfa);
        String callback = URLEncoder.encode(urls,"utf-8");
//        String callback = URLEncoder.encode(urls);

        Gdata gdata = new Gdata();
        gdata.setGid(Integer.valueOf(gid));
        gdata.setIdfa(idfa);
        gdata.setCtime(TimeUtil.getDate(TimeUtil.getDateNum()));
        gdata.setCip(cip);
        gdata.setChannel(channel);
        gdata.setStatus(1);

        //接收到的数据存入数据库
        gService.insert(gdata);

        //根据gid查找state为1的广告主url
        //http://chance.adsensor.org/track/26a9f19f/1E6FE4DEDFCC74B40CF2371FA5C356E2?campaignId=QUpIQeR15T7A&sucd=1&s2s=1&ip={ip}&idfa={idfa}&callback={callback}
        List<Gconfig> list = gService.findGconfigByGid(Integer.valueOf(gid),"1");
        String url = list.get(0).getUrl();
        String param = list.get(0).getParam();

        //替换参数
        //设备唯一标识idfa
        param = param.replace("IDFA",idfa);
        //点击ip
        param = param.replace("CIP",cip);
        param = param.replace("CALLBACK",callback);

//        String result = url + param;
//        System.out.println("===============================" + result);

        //向广告主发送get请求
        String result = HttpRequest.sendGet(url, param);
        return result;
    }

    /**
     * 拼多多激活回调给塔肯
     * @param request
     * @param gid
     * @param idfa
     * @return
     *
     * http://59.110.212.27/token/f/advertiserFront/advertiserCallback?tokenid=38&idfa={idfa}&imei={imei}&ip={ip}   塔肯接口
     */
    //接受广告主的激活回调并发给渠道
    @RequestMapping("/gActivation/pinduoduo")
    @ResponseBody
    public String pinduoduo(HttpServletRequest request,String gid,String idfa){
//        http://localhost:8080/gActivation/pinduoduo.do?gid=1250294840&idfa=asdfasdf&imei=&regip=10.10.2.3&regtime=3241234234

        //根据gid和idfa更新激活状态为2
        boolean b = gService.updateStatusByGid(Integer.valueOf(gid),idfa,2);

        //将激活数据转发给渠道
        //根据gid，state和渠道号
        List<Gconfig> list= gService.findGconfigByGidAndState(Integer.valueOf(gid),2);

        String url = list.get(0).getUrl();
        String param = list.get(0).getParam();



        param = param.replace("IDFA",idfa);

//        System.out.println("====================" + url + param);


        //扣量逻辑
        int kouliang = 20;
        Random r = new Random();
        int i = r.nextInt(100);

        String result = "";

        if (20 <= i){
            result = HttpRequest.sendGet(url, param);
        }

        return result;
    }
}
