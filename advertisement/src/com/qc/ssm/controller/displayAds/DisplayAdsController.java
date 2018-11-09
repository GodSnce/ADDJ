package com.qc.ssm.controller.displayAds;

import com.qc.ssm.po.displayAds.Clickads;
import com.qc.ssm.po.displayAds.Clickdata;
import com.qc.ssm.request.HttpRequest;
import com.qc.ssm.service.displayAds.DisplayAdsService;
import com.qc.ssm.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class DisplayAdsController {


    @Autowired
    private DisplayAdsService displayAdsService;

    @RequestMapping("/displayAds")
    public void displayAds(HttpServletRequest request, HttpServletResponse response, String appid) {

        String agent = request.getHeader("user-agent");

        List<Clickads> clickads = displayAdsService.selectByAppid(appid);

        Clickdata clickdata = new Clickdata();
        clickdata.setAppid(appid);
        String ip = request.getHeader("X-Real-IP");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("x-forwarded-for");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        clickdata.setIp(ip);

        if (agent.contains("iPhone") || agent.contains("iPod") || agent.contains("iPad")) {

            //凤凰新闻ios对接
            if (appid == "fenghuangxinwen"){
                String url = "";
                String param = "";
                HttpRequest.sendGet(url,param);
            }

            clickdata.setState("iPhone");
            clickdata.setTime(TimeUtil.getDateN());
            boolean flag = displayAdsService.insert(clickdata);
//            if (agent.contains("Safari")) {
//                try {//通过手机跳转到苹果应用市场（重定向）
//                    response.sendRedirect("https://itunes.apple.com/cn/app/qq/id444934666?mt=8");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            } else {//跳转到自定义页面，添加提示在浏览器中打开的提示（转发，在浏览器中打开时，地址不变）
            try {//听过手机跳转到苹果应用市场（重定向）
                response.sendRedirect(clickads.get(0).getIos());
            } catch (IOException e) {
                e.printStackTrace();
            }
//            }
        } else if (agent.contains("Android")) {
            clickdata.setState("Android");
            clickdata.setTime(TimeUtil.getDateN());
            boolean flag = displayAdsService.insert(clickdata);
            try {
//                if (agent.contains("MI")) {//小米手机跳转到小米应用市场
//                    response.sendRedirect("http://app.mi.com/details?id=com.yuedong.sport");
//                } else {
                response.sendRedirect(clickads.get(0).getAndroid());
//                }
            } catch (IOException e) {
            }
        }

    }

    @RequestMapping("/getImgList")
    @ResponseBody
    public List<Clickads> getImgList(HttpServletRequest request,HttpServletResponse response) throws IOException {

        List<Clickads> clickads = displayAdsService.select();

//        String s = JSONArray.toJSONString(clickads);
//        return clickads;

//        response.setContentType("application/json;charset=UTF-8");
//        response.getWriter().print(JSON.toJSONString(clickads));
        return clickads;
    }

    @RequestMapping("/clickads")
    public String clickads(){

        //banner展示
        return "embed/index";

        //砸蛋抽奖
//        return "zadan/index";

        //扫雷
//        return "saolei/index";

        //翻牌子
//        return "flop/index";
    }
}
