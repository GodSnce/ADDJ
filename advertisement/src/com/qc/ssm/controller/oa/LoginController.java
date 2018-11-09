package com.qc.ssm.controller.oa;

import com.qc.ssm.service.oa.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {


    @Autowired
    private LoginService loginService;

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/login")
    public String login(){

        return "pages/login/login";
    }

    /**
     * 登录方法
     * @param request
     * @param username  用户名
     * @param password  密码
     * @return
     */
    @RequestMapping("/userLogin")
    public String userLogin(HttpServletRequest request,String username,String password){


        boolean flag = loginService.userLogin(username,password);
//        System.out.println(username + "........" + password);

        if (flag){
//            return "index/index";
            return "dBase10/index2";
        }else {
            return null;
        }

    }

}
