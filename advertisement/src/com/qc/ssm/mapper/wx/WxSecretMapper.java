package com.qc.ssm.mapper.wx;

import com.qc.ssm.po.wx.WxSecret;
import com.qc.ssm.po.wx.WxSecretExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WxSecretMapper {
    int countByExample(WxSecretExample example);

    int deleteByExample(WxSecretExample example);

    int deleteByPrimaryKey(String id);

    int insert(WxSecret record);

    int insertSelective(WxSecret record);

    List<WxSecret> selectByExample(WxSecretExample example);

    WxSecret selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WxSecret record, @Param("example") WxSecretExample example);

    int updateByExample(@Param("record") WxSecret record, @Param("example") WxSecretExample example);

    int updateByPrimaryKeySelective(WxSecret record);

    int updateByPrimaryKey(WxSecret record);

    List<WxSecret> getAllSecret();

}