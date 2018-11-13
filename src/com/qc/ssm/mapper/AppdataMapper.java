package com.qc.ssm.mapper;

import com.qc.ssm.po.Appdata;
import com.qc.ssm.po.AppdataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AppdataMapper {
    int countByExample(AppdataExample example);

    int deleteByExample(AppdataExample example);

    int deleteByPrimaryKey(Integer appid);

    int insert(Appdata record);

    int insertSelective(Appdata record);

    List<Appdata> selectByExample(AppdataExample example);

    Appdata selectByPrimaryKey(Integer appid);

    int updateByExampleSelective(@Param("record") Appdata record, @Param("example") AppdataExample example);

    int updateByExample(@Param("record") Appdata record, @Param("example") AppdataExample example);

    int updateByPrimaryKeySelective(Appdata record);

    int updateByPrimaryKey(Appdata record);
    
    void updateStatusByAppidAndIdfa(Map<String, Object> map);

    List<Appdata> findByAppidIdfa(Map<String, Object> map);
}