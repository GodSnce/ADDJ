package com.qc.ssm.service.wx;

import com.qc.ssm.po.wx.XyxSummary;

import java.util.List;

public interface XyxService {
    List<XyxSummary> getXyxJson(int begin,int size);

    List<XyxSummary> getXyxByFenlei(String fl);
}
