package com.qc.ssm.service.wx.impl;

import com.qc.ssm.mapper.wx.WxGameMapper;
import com.qc.ssm.po.wx.WxGame;
import com.qc.ssm.po.wx.XyxSummary;
import com.qc.ssm.service.wx.WxGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 微信小游戏服务层实现类
 */
@Service
public class WxGameServiceImpl implements WxGameService{

    @Autowired
    private WxGameMapper wxGameMapper;

    /**
     * 根据点击次数排序查询小程序
     * @param index
     * @param pageSize
     * @return
     */
    @Override
    public List<WxGame> getWxGame(int index, int pageSize) {

        Map map = new HashMap();
        map.put("index",index);
        map.put("size",pageSize);

        List<WxGame> list = wxGameMapper.getWxGame(map);

        return list;
    }

    @Override
    public String addWxGameVisit(int id) {

        WxGame wxGame = wxGameMapper.selectByPrimaryKey(id);

        int visitAmount = wxGame.getVisitAmount() + 1;
        wxGame.setVisitAmount(visitAmount);

        int i = wxGameMapper.updateByPrimaryKey(wxGame);

        if (i > 0){
            return "OK";
        }else {
            return "NO";
        }
    }

    @Override
    public List<WxGame> getRecommend() {

        List<WxGame> list = wxGameMapper.getRecommend();

        return list;
    }

    @Override
    public WxGame getWxGameById(int id) {

        WxGame wxGame = wxGameMapper.selectByPrimaryKey(id);

        return wxGame;
    }

    @Override
    public List<WxGame> getJsonByKeyword(String keyword) {

        Map map = new HashMap();
        map.put("keyword","%" + keyword + "%");

        List<WxGame> list = wxGameMapper.getJsonByKeyword(map);

        return list;
    }

    @Override
    public List getJsonByCategory(String category) {

        Map map = new HashMap();
        map.put("category","%" + category + "%");

        List<WxGame> list = wxGameMapper.getJsonByCategory(map);

        return list;
    }
}
