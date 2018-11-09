package com.qc.ssm.service.jfq.impl;

import com.qc.ssm.mapper.jfq.JfqUserMapper;
import com.qc.ssm.po.jfq.JfqUser;
import com.qc.ssm.service.jfq.JfqLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JfqLoginServiceImpl implements JfqLoginService {

    @Autowired
    private JfqUserMapper jfqUserMapper;


    /*
    判断用户是否已经注册
     */
    @Override
    public List<JfqUser> findUserByIdfa(String idfa) {

        Map<String,String> map = new HashMap<String, String>();
        map.put("idfa",idfa);
        List<JfqUser> users = jfqUserMapper.findUserByIdfa(map);

        return users;
    }

    /*
    注册用户
     */
    @Override
    public boolean insert(JfqUser jfqUser){
        int insert = jfqUserMapper.insert(jfqUser);
        if (insert > 0){
            return true;
        }else {
            return false;
        }
    }
}
