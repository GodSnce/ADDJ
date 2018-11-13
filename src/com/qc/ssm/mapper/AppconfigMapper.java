package com.qc.ssm.mapper;

import com.qc.ssm.po.Appconfig;
import com.qc.ssm.po.AppconfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AppconfigMapper {
    int countByExample(AppconfigExample example);

    int deleteByExample(AppconfigExample example);

    int deleteByPrimaryKey(Integer appid);

    int insert(Appconfig record);

    int insertSelective(Appconfig record);

    List<Appconfig> selectByExample(AppconfigExample example);

    Appconfig selectByPrimaryKey(Integer appid);

    int updateByExampleSelective(@Param("record") Appconfig record, @Param("example") AppconfigExample example);

    int updateByExample(@Param("record") Appconfig record, @Param("example") AppconfigExample example);

    int updateByPrimaryKeySelective(Appconfig record);

    int updateByPrimaryKey(Appconfig record);

    List<Appconfig> findAppConfigByAppidAndStatus(Map<String, Object> map);

    List<Appconfig> findAppConfigByAppidStaChan(Map<String, Object> map);
}