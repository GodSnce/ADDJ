package com.qc.ssm.service.impl;

import com.qc.ssm.mapper.AppconfigMapper;
import com.qc.ssm.mapper.AppdataMapper;
import com.qc.ssm.po.Appconfig;
import com.qc.ssm.po.Appdata;
import com.qc.ssm.service.AppService;
import com.qc.ssm.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private AppdataMapper appdataMapper;

    @Autowired
    private AppconfigMapper appconfigMapper;

    /**
     * 插入数据
     * @param appdata
     */
    @Override
    public void insert(Appdata appdata) {
        appdataMapper.insert(appdata);
    }

    /**
     * 根据appid和status查找配置信息
     * @param appid
     * @param status
     * @return
     */
    @Override
    public List<Appconfig> findAppConfigByAppidAndStatus(String appid, String status) {

        Map<String,Object> map = new HashMap<>();
        map.put("appid",appid);
        map.put("status",status);

        List<Appconfig> appconfig = appconfigMapper.findAppConfigByAppidAndStatus(map);

        return appconfig;
    }

    /**
     * 根据appid和idfa更新状态和注册时间
     * @param appid
     * @param idfa
     * @param status
     */
    @Override
    public void updateStatusByAppidAndIdfa(String appid, String idfa, int status) {

        Map<String,Object> map = new HashMap<>();
        map.put("appid",appid);
        map.put("idfa",idfa);
        map.put("status",status);
        map.put("regtime", TimeUtil.getDateN());

        appdataMapper.updateStatusByAppidAndIdfa(map);

    }

    /**
     * 根据appid、status、channel查找配置信息
     * @param appid
     * @param status
     * @param channel
     * @return
     */
    @Override
    public List<Appconfig> findAppConfigByAppidStaChan(String appid, String status, String channel) {

        Map<String,Object> map = new HashMap<>();
        map.put("appid",appid);
        map.put("channel",channel);
        map.put("status",status);

        List<Appconfig> appconfigs = appconfigMapper.findAppConfigByAppidStaChan(map);

        return appconfigs;
    }

    /**
     * 根据appid、idfa查找数据
     * @param appid
     * @param idfa
     * @return
     */
    @Override
    public List<Appdata> findByAppidIdfa(String appid, String idfa) {

        Map<String,Object> map = new HashMap<>();
        map.put("appid",appid);
        map.put("idfa",idfa);

        List<Appdata> list = appdataMapper.findByAppidIdfa(map);

        return list;
    }
}
