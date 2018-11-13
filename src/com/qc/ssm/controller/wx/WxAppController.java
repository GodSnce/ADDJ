package com.qc.ssm.controller.wx;

import com.qc.ssm.po.wx.WxApplication;
import com.qc.ssm.service.wx.WxAppService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 微信小程序接口
 */
@Controller
public class WxAppController {

    @Autowired
    private WxAppService wxAppService;

    private static Logger logger = Logger.getLogger(WxAppController.class);

    /**
     * 根据访问量排序查询全部数据
     * @param request
     * @param response
     * @param page
     * @return
     */
    @RequestMapping("/getWxApplication")
    @ResponseBody
    public List<WxApplication> getWxApplication(HttpServletRequest request, HttpServletResponse response, String page){

        logger.info("测试");
        logger.debug("DEBUG");

        Integer num = Integer.valueOf(page);

        int pageSize = 20;

        List<WxApplication> list = wxAppService.getWxApplication(pageSize*(num-1),pageSize);

        return list;
    }


    @RequestMapping("/addWxAppVisit")
    @ResponseBody
    public String addWxAppVisit(HttpServletRequest request, HttpServletResponse response, int id){

        String result = wxAppService.addWxAppVisit(id);

        return result;
    }

}
