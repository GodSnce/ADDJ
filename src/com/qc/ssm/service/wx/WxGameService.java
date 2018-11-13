package com.qc.ssm.service.wx;

import com.qc.ssm.po.wx.WxGame;

import java.util.List;

/**
 * 微信小游戏服务层接口
 */
public interface WxGameService {
    List<WxGame> getWxGame(int index, int pageSize);

    String addWxGameVisit(int id);

    List<WxGame> getRecommend();

    WxGame getWxGameById(int id);

    List<WxGame> getJsonByKeyword(String keyword);

    List getJsonByCategory(String word);
}
