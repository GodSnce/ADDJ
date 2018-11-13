package com.qc.ssm.service.displayAds.impl;

import com.qc.ssm.mapper.displayAds.ClickadsMapper;
import com.qc.ssm.mapper.displayAds.ClickdataMapper;
import com.qc.ssm.po.displayAds.Clickads;
import com.qc.ssm.po.displayAds.Clickdata;
import com.qc.ssm.service.displayAds.DisplayAdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DisplayAdsServiceImpl implements DisplayAdsService {

    @Autowired
    private ClickadsMapper clickadsMapper;

    @Autowired
    private ClickdataMapper clickdataMapper;

    @Override
    public List<Clickads> selectByAppid(String appid) {

        Map<String,String> map = new HashMap<String, String>();
        map.put("appid",appid);

        List<Clickads> clickads = clickadsMapper.selectByAppid(map);

        return clickads;
    }

    @Override
    public boolean insert(Clickdata clickdata) {

        int insert = clickdataMapper.insert(clickdata);

        if (insert > 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Clickads> select() {

        List<Clickads> clickads = clickadsMapper.select();

        return clickads;
    }

}
