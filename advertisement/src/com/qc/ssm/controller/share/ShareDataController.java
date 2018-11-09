package com.qc.ssm.controller.share;

import com.qc.ssm.po.share.ShareData;
import com.qc.ssm.service.share.ShareDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ShareDataController {


    @Autowired
    private ShareDataService shareDataService;


    /**
     * 本地测试请求链接
     * 获取推荐数据
     * http://localhost:8080/getShareDataByCategory.do
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/getShareDataByCategory")
    @ResponseBody
    public Map<String,Object> getShareDataByCategory(HttpServletRequest request, HttpServletResponse response,String category,String type){

        Map<String,Object> map = new HashMap();

        List<ShareData> list = shareDataService.getShareDataByCategory(category,type);

        map.put("success" , true);
        map.put("data",list);

        return map;
    }

    @RequestMapping("/getImageDetailById")
    @ResponseBody
    public Map<String,Object> getImageDetailById(HttpServletRequest request, HttpServletResponse response,String id){

        Map<String,Object> map = new HashMap();

        List<ShareData> list = shareDataService.getImageDetailById(id);

        map.put("success" , true);
        map.put("data",list);

        return map;
    }

}
