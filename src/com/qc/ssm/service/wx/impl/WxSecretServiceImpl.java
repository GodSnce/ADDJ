package com.qc.ssm.service.wx.impl;

import com.qc.ssm.mapper.wx.WxSecretMapper;
import com.qc.ssm.po.wx.WxSecret;
import com.qc.ssm.service.wx.WxSecretService;
import com.qc.ssm.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WxSecretServiceImpl implements WxSecretService{

    @Autowired
    private WxSecretMapper wxSecretMapper;


    @Override
    public List<WxSecret> getAllSecret(int index, int pageSize) {

        List<WxSecret> list = wxSecretMapper.getAllSecret();

        return list;
    }

    @Override
    public String addSecret(String title) {

        String id = UUID.randomUUID().toString().replace("-","");

        WxSecret wxSecret = new WxSecret();
        wxSecret.setId(id);
        wxSecret.setTitle(title);
        wxSecret.setTime(TimeUtil.getDateN());

        int insert = wxSecretMapper.insert(wxSecret);

        if (insert > 0){
            return "ok";
        }else {
            return "no";
        }

    }


}
