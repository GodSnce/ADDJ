package com.qc.ssm.service.oa.impl;

import com.qc.ssm.mapper.UserMapper;
import com.qc.ssm.po.User;
import com.qc.ssm.service.oa.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean userLogin(String username, String password) {

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("username",username);
        map.put("password",password);

        List<User> list = userMapper.findByUsernamePassword(map);

        if (list.size() < 1){
            return false;
        }else {
            return true;
        }
    }
}
