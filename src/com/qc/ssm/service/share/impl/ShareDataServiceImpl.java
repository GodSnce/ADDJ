package com.qc.ssm.service.share.impl;

import com.qc.ssm.mapper.share.ShareDataMapper;
import com.qc.ssm.po.share.ShareData;
import com.qc.ssm.service.share.ShareDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShareDataServiceImpl implements ShareDataService {

    @Autowired
    private ShareDataMapper shareDataMapper;


    @Override
    public List<ShareData> getShareDataByCategory(String category,String type) {

        Map map = new HashMap();
        map.put("category",category);
        map.put("type",type);

        List<ShareData> list = shareDataMapper.getShareDataByCategory(map);

        return list;
    }

    @Override
    public List<ShareData> getImageDetailById(String id) {

        Map map = new HashMap();
        map.put("id",id);

        List<ShareData> list = shareDataMapper.getImageDetailById(map);

        return list;
    }
}
