package com.qc.ssm.service.displayAds;

import com.qc.ssm.po.displayAds.Clickads;
import com.qc.ssm.po.displayAds.Clickdata;

import java.util.List;

public interface DisplayAdsService {

    List<Clickads> selectByAppid(String appid);

    boolean insert(Clickdata clickdata);

    List<Clickads> select();
}
