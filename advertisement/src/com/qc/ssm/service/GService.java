package com.qc.ssm.service;

import com.qc.ssm.po.Gconfig;
import com.qc.ssm.po.Gdata;

import java.util.List;

public interface GService {

    //将点击数据插入数据库
    void insert(Gdata gdata);

    //根据gid和state查询广告主接口地址
    List<Gconfig> findGconfigByGid(Integer gid,String state);

    //根据gid和idfa更新激活状态status
    boolean updateStatusByGid(Integer gid, String idfa, Integer status);

    //根据gid和channel查询渠道接口地址
    List<Gconfig> findGconfigByGidAndChannel(Integer gid, String channel);

    List<Gconfig> findGconfigByGidAndState(Integer gid, Integer state);
}
