package com.qc.ssm.service;

import com.qc.ssm.po.Paichong;

import java.util.List;

public interface Pcservice {
    void insert(Paichong paichong);

    List<Paichong> selectByIdfa(String idfa,String appid);
}
