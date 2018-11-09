package com.qc.ssm.service.impl;

import com.qc.ssm.mapper.PaichongMapper;
import com.qc.ssm.po.Paichong;
import com.qc.ssm.service.Pcservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PcserviceImpl implements Pcservice {

    @Autowired
    private PaichongMapper paichongMapper;

    @Override
    public void insert(Paichong paichong) {
        paichongMapper.insert(paichong);
    }

    @Override
    public List<Paichong> selectByIdfa(String idfa,String appid) {

        Map<String,Object> map = new HashMap<>();
        map.put("idfa",idfa);
        map.put("appid",Integer.valueOf(appid));

        List<Paichong> list = paichongMapper.selectByIdfa(map);
        return list;
    }
}
