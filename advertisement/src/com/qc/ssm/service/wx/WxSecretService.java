package com.qc.ssm.service.wx;

import com.qc.ssm.po.wx.WxSecret;

import java.util.List;

public interface WxSecretService {
    List<WxSecret> getAllSecret(int index, int pageSize);

    String addSecret(String title);
}
