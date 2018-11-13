package com.qc.ssm.service.impl;

import com.qc.ssm.mapper.GconfigMapper;
import com.qc.ssm.mapper.GdataMapper;
import com.qc.ssm.po.Gconfig;
import com.qc.ssm.po.Gdata;
import com.qc.ssm.service.GService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GServiceImpl implements GService {

    @Autowired
    private GdataMapper gdataMapper;

    @Autowired
    private GconfigMapper gconfigMapper;

    //上报点击时插入
    @Override
    public void insert(Gdata gdata) {

        gdataMapper.insert(gdata);

    }

    //上报点击
    @Override
    public List<Gconfig> findGconfigByGid(Integer gid, String state) {


        Map<String,Object> map = new HashMap<>();
        map.put("gid",gid);
        map.put("state",state);
        List<Gconfig> gconfig = gconfigMapper.findGconfigByGid(map);


        return gconfig;
    }

    //回调激活时更改状态
    @Override
    public boolean updateStatusByGid(Integer gid, String idfa, Integer status) {


        Map<String,Object> map = new HashMap<>();
        map.put("gid",gid);
        map.put("idfa",idfa);
        map.put("status",status);
        boolean b = gdataMapper.updateStatusByGid(map) == 1;

        return b;
    }

    //回调激活查询链接
    @Override
    public List<Gconfig> findGconfigByGidAndChannel(Integer gid, String channel) {
        return null;
    }

    @Override
    public List<Gconfig> findGconfigByGidAndState(Integer gid, Integer state) {

        Map<String,Object> map = new HashMap<>();
        map.put("gid",gid);
        map.put("state",state);

        List<Gconfig> list = gconfigMapper.findGconfigByGid(map);
        return list;
    }

}
