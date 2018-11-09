package com.qc.ssm.service.wx;

import com.qc.ssm.po.wx.WxApplication;

import java.util.List;

/**
 * 微信小程序服务层接口
 */
public interface WxAppService {
    List<WxApplication> getWxApplication(int index, int pageSize);

    List<WxApplication> getJsonByKeyword(String word);

    List getJsonByCategory(String word);

    String addWxAppVisit(int id);
}
