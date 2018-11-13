package com.qc.ssm.controller;

import com.qc.ssm.po.Appconfig;
import com.qc.ssm.po.Paichong;
import com.qc.ssm.request.HttpRequest;
import com.qc.ssm.service.AppService;
import com.qc.ssm.service.Pcservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 排重接口
 *
 * Created by lishanglai on 2017/10/13.
 */


@Controller
public class PaiChongController {

    @Autowired
    private AppService appService;

    @Autowired
    private Pcservice pcservice;

    @RequestMapping("/paichong")
    @ResponseBody
    public String paiChong(HttpServletRequest request,
                           @RequestParam(value = "appid",required = false,defaultValue = "") String appid,
                           @RequestParam(value = "idfa",required = false,defaultValue = "") String idfa) {


        Paichong paichong = new Paichong();
        paichong.setAppid(Integer.valueOf(appid));
        paichong.setIdfa(idfa);

        pcservice.insert(paichong);


        // 根据appid与state查找上游点击链接和参数
        List<Appconfig> list = appService.findAppConfigByAppidAndStatus(appid, "3");

        // 在数据库中查询参数，之后使用替换将参数值放进去
        String param = list.get(0).getParam();
        String url = list.get(0).getUrl();


//            拼接之后发给广告主进行排重
        if (param.contains("IDFA")){
            param = param.replace("IDFA",idfa);
        }
        if (param.contains("APPID")){
            param = param.replace("APPID",appid);
        }

        String result = HttpRequest.sendGet(url, param);

        return result;
    }

    @RequestMapping("/paichong/qd")
    @ResponseBody
    public Map paiChongQd(HttpServletRequest request,
                          @RequestParam(value = "appid",required = false,defaultValue = "") String appid,
                          @RequestParam(value = "idfa",required = false,defaultValue = "") String idfa) {


        Map map = new HashMap();

        Paichong paichong = new Paichong();
        paichong.setAppid(Integer.valueOf(appid));
        paichong.setIdfa(idfa);

        List<Paichong> list = pcservice.selectByIdfa(idfa,appid);

        if (list.size() > 0){
            map.put("status","1");
           return map;
        }else {
            pcservice.insert(paichong);
            map.put("status","0");
            return map;
        }

    }

}
