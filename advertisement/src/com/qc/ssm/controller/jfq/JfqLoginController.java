package com.qc.ssm.controller.jfq;

import com.alibaba.fastjson.JSON;
import com.qc.ssm.po.jfq.JfqUser;
import com.qc.ssm.service.jfq.JfqLoginService;
import com.qc.ssm.sms.request.SmsSendRequest;
import com.qc.ssm.sms.response.SmsSendResponse;
import com.qc.ssm.sms.util.ChuangLanSmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

/**
 * 积分墙用户登录注册逻辑
 */

@Controller
public class JfqLoginController {

    @Autowired
    private JfqLoginService jfqLoginService;


    public static final String charset = "utf-8";
    // 请登录zz.253.com 获取创蓝API账号(非登录账号,示例:N1234567)
    public static String account = "N4141513";
    // 请登录zz.253.com 获取创蓝API密码(非登录密码)
    public static String password = "CqlNnU4sva8a8f";

    /**
     * 获取手机号，向手机号发送验证码
     * @param phoneNumber
     * @return
     */
    @RequestMapping("/getCheckCode")
    @ResponseBody
    public String getCheckCode(HttpServletRequest request,String phoneNumber){
        //短信发送的URL 请登录zz.253.com 获取完整的URL接口信息
        String smsSingleRequestServerUrl = "http://smssh1.253.com/msg/send/json";
        // 设置您要发送的内容：其中“【】”中括号为运营商签名符号，多签名内容前置添加提交
        String msg = "【253云通讯】你好,你的验证码是";

        //验证码随机6位数
        int random = (int)((Math.random()*9+1)*100000);
        //短信内容2
        String msg2 = "" + random;
        //短信内容拼接
        msg = msg + msg2;
        System.out.println(msg);
        //手机号码
        String phone = "159*******";
        //状态报告
        String report= "true";

        SmsSendRequest smsSingleRequest = new SmsSendRequest(account, password, msg, phoneNumber,report);

        String requestJson = JSON.toJSONString(smsSingleRequest);

        System.out.println("before request string is: " + requestJson);

        String response = ChuangLanSmsUtil.sendSmsByPost(smsSingleRequestServerUrl, requestJson);

        System.out.println("response after request result is :" + response);

        SmsSendResponse smsSingleResponse = JSON.parseObject(response, SmsSendResponse.class);

        System.out.println("response  toString is :" + smsSingleResponse);


        return String.valueOf(random);
    }

    /**
     * 检验是否注册
     * @param idfa
     * @param uuid
     * @return
     */
    @RequestMapping("/checkReg")
    @ResponseBody
    public List checkReg(String idfa,String uuid){
        //查询库中是否存在
        List<JfqUser> user = jfqLoginService.findUserByIdfa(idfa);

        if (user.size() > 0){
            return user;
        }else {
            return null;
        }

    }



    /**
     * 检验验证码
     * 注册用户
     * @param phoneNumber
     * @param password
     * @param uuid
     * @param idfa
     * @return
     */
    @RequestMapping("/register")
    public String register(String phoneNumber,String password,String uuid,String idfa){

        //1.随机生成32位id
        String ranuuid = UUID.randomUUID().toString().replace("-", "");
        //2.如果验证码正确，随机生成8为的用户名
        int random = (int)((Math.random()*9+1)*100000);
        String username = "SK" + String.valueOf(random);
        //3.将所有传来的信息存储到数据库

        JfqUser jfqUser = new JfqUser();
        jfqUser.setId(ranuuid);
        jfqUser.setUsername(username);
        jfqUser.setPhone(phoneNumber);
        jfqUser.setPassword(password);
        jfqUser.setUuid(uuid);
        jfqUser.setIdfa(idfa);
        boolean b = jfqLoginService.insert(jfqUser);

        if (b){
            return "ok";
        }else {
            return "false";
        }
    }

    /**
     * 手机号和密码登录
     * @param phoneNumber
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public String login(String phoneNumber,String password){



        return null;
    }



}
