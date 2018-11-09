package com.qc.ssm.mapper;

import com.qc.ssm.po.Gdata;
import com.qc.ssm.po.GdataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GdataMapper {
    int countByExample(GdataExample example);

    int deleteByExample(GdataExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Gdata record);

    int insertSelective(Gdata record);

    List<Gdata> selectByExample(GdataExample example);

    Gdata selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Gdata record, @Param("example") GdataExample example);

    int updateByExample(@Param("record") Gdata record, @Param("example") GdataExample example);

    int updateByPrimaryKeySelective(Gdata record);

    int updateByPrimaryKey(Gdata record);

    List<Gdata> findGconfigByGid(Map<String, Object> map);

    int updateStatusByGid(Map<String, Object> map);

    List<Gdata> queryGameData();

}