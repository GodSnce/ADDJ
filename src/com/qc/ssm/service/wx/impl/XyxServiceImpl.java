package com.qc.ssm.service.wx.impl;

import com.qc.ssm.mapper.wx.XyxSummaryMapper;
import com.qc.ssm.po.wx.XyxSummary;
import com.qc.ssm.service.wx.XyxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class XyxServiceImpl implements XyxService {


    @Autowired
    private XyxSummaryMapper xyxSummaryMapper;

    @Override
    public List<XyxSummary> getXyxJson(int begin,int size) {

        Map<String,Integer> map = new HashMap<>();
        map.put("begin",begin);
        map.put("size",size);

        List<XyxSummary> list = xyxSummaryMapper.selectAll(map);

        return list;
    }

    @Override
    public List<XyxSummary> getXyxByFenlei(String fl) {

        Map<String,String> map = new HashMap<>();
        map.put("fl",fl);

        List<XyxSummary> list = xyxSummaryMapper.getXyxByFenlei(map);

        return list;
    }
}
