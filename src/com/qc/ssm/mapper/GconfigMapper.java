package com.qc.ssm.mapper;

import com.qc.ssm.po.Gconfig;
import com.qc.ssm.po.GconfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GconfigMapper {
    int countByExample(GconfigExample example);

    int deleteByExample(GconfigExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Gconfig record);

    int insertSelective(Gconfig record);

    List<Gconfig> selectByExample(GconfigExample example);

    Gconfig selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Gconfig record, @Param("example") GconfigExample example);

    int updateByExample(@Param("record") Gconfig record, @Param("example") GconfigExample example);

    int updateByPrimaryKeySelective(Gconfig record);

    int updateByPrimaryKey(Gconfig record);

    List<Gconfig> findGconfigByGid(Map<String, Object> map);

    List<Gconfig> findGconfigByGidAndState(Map<String, Object> map);

    List<Gconfig> queryGconfig(Map<String, Object> map);

    int queryGameConfigCount();
}