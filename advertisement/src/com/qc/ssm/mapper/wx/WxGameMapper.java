package com.qc.ssm.mapper.wx;

import com.qc.ssm.po.wx.WxGame;
import com.qc.ssm.po.wx.WxGameExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface WxGameMapper {
    int countByExample(WxGameExample example);

    int deleteByExample(WxGameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxGame record);

    int insertSelective(WxGame record);

    List<WxGame> selectByExample(WxGameExample example);

    WxGame selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxGame record, @Param("example") WxGameExample example);

    int updateByExample(@Param("record") WxGame record, @Param("example") WxGameExample example);

    int updateByPrimaryKeySelective(WxGame record);

    int updateByPrimaryKey(WxGame record);

    List<WxGame> getWxGame(Map map);

    List<WxGame> getRecommend();

    List<WxGame> getJsonByKeyword(Map map);

    List<WxGame> getJsonByCategory(Map map);
}