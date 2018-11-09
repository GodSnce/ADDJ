package com.qc.ssm.service.wx.impl;

import com.qc.ssm.mapper.wx.WxApplicationMapper;
import com.qc.ssm.po.wx.WxApplication;
import com.qc.ssm.service.wx.WxAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 微信小程序服务层
 */
@Service
public class WxAppServiceImpl implements WxAppService{

    @Autowired
    private WxApplicationMapper wxApplicationMapper;

    @Override
    public List<WxApplication> getWxApplication(int index, int pageSize) {

        Map map = new HashMap();
        map.put("index",index);
        map.put("size",pageSize);

        List<WxApplication> list = wxApplicationMapper.getWxApplication(map);

        return list;
    }

    @Override
    public List<WxApplication> getJsonByKeyword(String word) {

        Map map = new HashMap();
        map.put("word","%" + word + "%");

        List<WxApplication> list = wxApplicationMapper.getJsonByKeyword(map);

        return list;

    }

    @Override
    public List getJsonByCategory(String category) {

        Map map = new HashMap();
        map.put("category","%" + category + "%");

        List<WxApplication> list = wxApplicationMapper.getJsonByCategory(map);

        return list;
    }

    @Override
    public String addWxAppVisit(int id) {

        WxApplication wxApplication = wxApplicationMapper.selectByPrimaryKey(id);

        int visitAmount = wxApplication.getVisitAmount() + 1;
        wxApplication.setVisitAmount(visitAmount);

        int i = wxApplicationMapper.updateByPrimaryKey(wxApplication);

        if (i > 0){
            return "OK";
        }else {
            return "NO";
        }
    }
}
