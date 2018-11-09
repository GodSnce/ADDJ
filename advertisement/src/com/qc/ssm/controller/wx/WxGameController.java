package com.qc.ssm.controller.wx;

import com.qc.ssm.po.wx.WxGame;
import com.qc.ssm.service.wx.WxAppService;
import com.qc.ssm.service.wx.WxGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * 微信小游戏接口
 */
@Controller
public class WxGameController {

    @Autowired
    private WxGameService wxGameService;

    @Autowired
    private WxAppService wxAppService;

    /**
     * 根据点击次数排序查询小游戏
     * @param request
     * @param response
     * @param page
     * @return
     */
    @RequestMapping("/getWxGame")
    @ResponseBody
    public List<WxGame> getWxGame(HttpServletRequest request, HttpServletResponse response, String page){

        Integer num = Integer.valueOf(page);

        int pageSize = 20;

        List<WxGame> list = wxGameService.getWxGame(pageSize*(num-1),pageSize);

        return list;
    }


    /**
     * 根据id增加访问次数
     * @param request
     * @param response
     * @param id
     * @return
     */
    @RequestMapping("/addWxGameVisit")
    @ResponseBody
    public String addWxGameVisit(HttpServletRequest request, HttpServletResponse response, int id){

        String result = wxGameService.addWxGameVisit(id);

        return result;
    }

    /**
     * 获取推荐位数据
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/getRecommend")
    @ResponseBody
    public List<WxGame> getRecommend (HttpServletRequest request, HttpServletResponse response){

        List<WxGame> list = wxGameService.getRecommend();

        return list;
    }

    /**
     * 根据id查询推荐位详情
     * @param request
     * @param response
     * @param id
     * @return
     */
    @RequestMapping("/getWxGameById")
    @ResponseBody
    public WxGame getWxGameById(HttpServletRequest request, HttpServletResponse response,int id){

        WxGame wxGame = wxGameService.getWxGameById(id);

        return wxGame;

    }

    /**
     * 根据关键字搜索游戏和应用拼接在一起的数据
     * @param request
     * @param response
     * @param keyword
     * @return
     */
    @RequestMapping("/getJsonByKeyword")
    @ResponseBody
    public List getJsonByKeyword(HttpServletRequest request, HttpServletResponse response,String keyword) throws UnsupportedEncodingException {

        String word = java.net.URLDecoder.decode(keyword,"UTF-8");

        List list = wxGameService.getJsonByKeyword(word);

        List list1 = wxAppService.getJsonByKeyword(word);

        list.addAll(list1);

        return list;
    }


    /**
     * 根据分类查询数据
     * @param request
     * @param response
     * @param category
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping("/getJsonByCategory")
    @ResponseBody
    public List getJsonByCategory(HttpServletRequest request, HttpServletResponse response,String category) throws UnsupportedEncodingException {

        String word = java.net.URLDecoder.decode(category,"UTF-8");

        List list = new ArrayList();

        if (word.equals("游戏")){
            list = wxGameService.getJsonByCategory(word);
        }else {
            list = wxAppService.getJsonByCategory(word);
        }

        return list;
    }
}
