package com.qc.ssm.controller.wx;

import com.qc.ssm.po.wx.XyxSummary;
import com.qc.ssm.service.wx.XyxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class XyxController {

    @Autowired
    private XyxService xyxService;

    @RequestMapping("/getXyxJson")
    @ResponseBody
    public List<XyxSummary> getJson(HttpServletRequest request, HttpServletResponse response,String page){

//        System.out.println(state);
        Integer num = Integer.valueOf(page);

        int pageSize = 20;

        List<XyxSummary> list = xyxService.getXyxJson(pageSize*(num-1),pageSize);

        return list;
    }


    /**
     * 根据分类获取游戏
     * @param request
     * @param response
     * @param fenlei
     * @return
     */
    @RequestMapping("/getXyxByFenlei")
    @ResponseBody
    public List<XyxSummary> getXyxByFenlei(HttpServletRequest request, HttpServletResponse response,String fenlei){

        String fl = "";
        switch (fenlei){
            case "xx":
                fl = "休闲";
                break;
            case "dz":
                fl = "动作";
                break;
            case "sj":
                fl = "射击";
                break;
            case "js":
                fl = "角色";
                break;
            case "ty":
                fl = "体育";
                break;
        }

        System.out.println(fl);

        List<XyxSummary> list = xyxService.getXyxByFenlei(fl);

        return list;
    }



}
