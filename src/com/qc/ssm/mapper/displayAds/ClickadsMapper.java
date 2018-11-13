package com.qc.ssm.mapper.displayAds;

import com.qc.ssm.po.displayAds.Clickads;
import com.qc.ssm.po.displayAds.ClickadsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ClickadsMapper {
    int countByExample(ClickadsExample example);

    int deleteByExample(ClickadsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clickads record);

    int insertSelective(Clickads record);

    List<Clickads> selectByExample(ClickadsExample example);

    Clickads selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clickads record, @Param("example") ClickadsExample example);

    int updateByExample(@Param("record") Clickads record, @Param("example") ClickadsExample example);

    int updateByPrimaryKeySelective(Clickads record);

    int updateByPrimaryKey(Clickads record);


    List<Clickads> selectByAppid(Map<String, String> map);

    List<Clickads> select();
}