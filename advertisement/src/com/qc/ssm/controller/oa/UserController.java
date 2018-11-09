package com.qc.ssm.controller.oa;

import com.qc.ssm.po.Menu;
import com.qc.ssm.po.User;
import com.qc.ssm.service.oa.UserService;
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
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUser")
    public void queryUser(HttpServletRequest request, HttpServletResponse response,int page,int rows) throws IOException {

        int begin = (page - 1) * rows;

        int total = userService.queryCount();
        List<User> list = userService.queryUser(begin,rows);

        String jsonList = JsonUtiles.toJsonList(total, list);

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(jsonList);


    }


    @RequestMapping("/getTopMenu")
    @ResponseBody
    public List<Menu> getTopMenu(HttpServletRequest request, HttpServletResponse response) {


        List<Menu> list = userService.getTopMenu();


      return list;

    }

}
