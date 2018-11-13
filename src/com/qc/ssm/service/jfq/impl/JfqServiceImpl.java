package com.qc.ssm.service.jfq.impl;

import com.qc.ssm.mapper.jfq.JifenqiangMapper;
import com.qc.ssm.po.jfq.Jifenqiang;
import com.qc.ssm.service.jfq.JfqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JfqServiceImpl implements JfqService {

    @Autowired
    private JifenqiangMapper jifenqiangMapper;

    @Override
    public List<Jifenqiang> getJson(String state) {

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("state",state);
        List<Jifenqiang> list = jifenqiangMapper.getJson(map);

        return list;
    }

    @Override
    public List<Jifenqiang> getJsonById(String id) {

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",id);
        List<Jifenqiang> list = jifenqiangMapper.getJsonById(map);

        return list;
    }
}
