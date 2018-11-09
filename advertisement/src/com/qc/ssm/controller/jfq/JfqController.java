package com.qc.ssm.controller.jfq;

import com.qc.ssm.po.jfq.Jifenqiang;
import com.qc.ssm.service.jfq.JfqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class JfqController {

    @Autowired
    private JfqService jfqService;

    @RequestMapping("/jfq")
    public String jfq(){
        return "jfq/index";
    }

    /**
     * 查询所有数据->任务列表页面
     * @param request
     * @param state -> 根据状态查询快速任务或回调任务
     * @return
     */

    @RequestMapping("/getJson")
    @ResponseBody
    public List<Jifenqiang> getJson(HttpServletRequest request,HttpServletResponse response,String state){

//        System.out.println(state);

        List<Jifenqiang> list = jfqService.getJson(state);

        return list;
    }


    /**
     * 根据id获取详细信息->任务详情页面
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("/getJsonById")
    @ResponseBody
    public List<Jifenqiang> getJsonById(HttpServletRequest request,String id){

        List<Jifenqiang> list = jfqService.getJsonById(id);

        return list;
    }

    @RequestMapping("/toAppStroe")
    public void toAppStroe(HttpServletRequest request, HttpServletResponse response,String id) throws UnsupportedEncodingException {

        //当用户点击跳转App Store时，认为接收任务，将库存-1
//        List<Jifenqiang> list = jfqService.getJsonById(id);
//        int countext = list.get(0).getCountext();
//        jfqService.updateCountextById(id,(countext-1));


        System.out.println("-------------------" + id);
        try {
//            response.sendRedirect("https://itunes.apple.com/WebObjects/MZStore.woa/wa/search?mt=8&submit=edit&term="+ URLEncoder.encode(kw,"UTF-8") + "#software");
            response.sendRedirect("https://itunes.apple.com/WebObjects/MZStore.woa/wa/search?mt=8&submit=edit&term=#software");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
