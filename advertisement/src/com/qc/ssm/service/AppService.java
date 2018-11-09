package com.qc.ssm.service;

import com.qc.ssm.po.Appconfig;
import com.qc.ssm.po.Appdata;

import java.util.List;

public interface AppService {


    void insert(Appdata appdata);

    List<Appconfig> findAppConfigByAppidAndStatus(String appid, String status);

    void updateStatusByAppidAndIdfa(String appid, String idfa,int status);

    List<Appconfig> findAppConfigByAppidStaChan(String appid, String status, String channel);

    List<Appdata> findByAppidIdfa(String appid, String idfa);
}
