package com.qc.ssm.controller.wx;

import com.qc.ssm.po.wx.WxSecret;
import com.qc.ssm.service.wx.WxSecretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 微信小程序
 * 应用汇的主页变更为朋友间的秘密分享
 */
@Controller
public class WxSecretController {

    @Autowired
    private WxSecretService wxSecretService;

    /**
     * 根据创建的时间排序查询所有的秘密
     * @param request
     * @param response
     * @param page
     * @return
     */
    @RequestMapping("/getAllSecret")
    @ResponseBody
    public List<WxSecret> getAllSecret(HttpServletRequest request, HttpServletResponse response, String page){

        Integer num = Integer.valueOf(page);

        int pageSize = 10;

        List<WxSecret> list = wxSecretService.getAllSecret(pageSize*(num-1),pageSize);

        return list;

    }


    @RequestMapping("/addSecret")
    @ResponseBody
    public String addSecret(HttpServletRequest request, HttpServletResponse response, String title){

        String result = wxSecretService.addSecret(title);

        return result;
    }

}
