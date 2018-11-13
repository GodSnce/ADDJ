package com.qc.ssm.mapper.displayAds;

import com.qc.ssm.po.displayAds.Clickdata;
import com.qc.ssm.po.displayAds.ClickdataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClickdataMapper {
    int countByExample(ClickdataExample example);

    int deleteByExample(ClickdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clickdata record);

    int insertSelective(Clickdata record);

    List<Clickdata> selectByExample(ClickdataExample example);

    Clickdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clickdata record, @Param("example") ClickdataExample example);

    int updateByExample(@Param("record") Clickdata record, @Param("example") ClickdataExample example);

    int updateByPrimaryKeySelective(Clickdata record);

    int updateByPrimaryKey(Clickdata record);
}