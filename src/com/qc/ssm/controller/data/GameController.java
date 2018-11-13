package com.qc.ssm.controller.data;

import com.qc.ssm.po.Gconfig;
import com.qc.ssm.po.Gdata;
import com.qc.ssm.service.data.GameService;
import com.qc.ssm.utils.JsonUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;


    /**
     * 查询游戏对接数据
     * @param request
     * @param response
     * @param page  页码
     * @param rows  每页记录数
     * @throws IOException
     */
    @RequestMapping("/queryGameConfig")
    public void queryGameConfig(HttpServletRequest request, HttpServletResponse response,int page,int rows,String gid,String channel,String btime,String etime) throws IOException {

        //起始条数
        int begin = (page-1)*rows;

        List<Gconfig> list = gameService.queryGameConfig(begin,rows);

        //分页总数
        int total = gameService.queryGameConfigCount();

        String jsonList = JsonUtiles.toJsonList(total, list);

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(jsonList);

    }

    @RequestMapping("/queryGameData")
    public void queryGameData(HttpServletRequest request,HttpServletResponse response) throws IOException {
        List<Gdata> gdataList = gameService.queryGameData();

        int total = gdataList.size();

        String jsonList = JsonUtiles.toJsonList(total, gdataList);

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(jsonList);
    }

    @RequestMapping("/saveGameConfig")
    @ResponseBody
    public String saveGameConfig(HttpServletRequest request,String gid,String state,String channel,String url,String param){

        //去掉最后多余的&
        param = param.substring(0,param.length()-2);

        Gconfig gconfig = new Gconfig();
        gconfig.setGid(Integer.valueOf(gid));
        gconfig.setState(state);
        gconfig.setChannel(channel);
        gconfig.setUrl(url);
        gconfig.setParam(param);

        boolean b = gameService.saveGameConfig(gconfig);

        if (b){
            return "success";
        }else {
            return "false";
        }
    }



}
