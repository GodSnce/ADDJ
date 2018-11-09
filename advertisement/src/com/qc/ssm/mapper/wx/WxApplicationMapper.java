package com.qc.ssm.mapper.wx;

import com.qc.ssm.po.wx.WxApplication;
import com.qc.ssm.po.wx.WxApplicationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface WxApplicationMapper {
    int countByExample(WxApplicationExample example);

    int deleteByExample(WxApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxApplication record);

    int insertSelective(WxApplication record);

    List<WxApplication> selectByExample(WxApplicationExample example);

    WxApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxApplication record, @Param("example") WxApplicationExample example);

    int updateByExample(@Param("record") WxApplication record, @Param("example") WxApplicationExample example);

    int updateByPrimaryKeySelective(WxApplication record);

    int updateByPrimaryKey(WxApplication record);

    List<WxApplication> getWxApplication(Map map);

    List<WxApplication> getJsonByKeyword(Map map);

    List<WxApplication> getJsonByCategory(Map map);
}