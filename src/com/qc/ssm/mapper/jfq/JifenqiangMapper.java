package com.qc.ssm.mapper.jfq;

import com.qc.ssm.po.jfq.Jifenqiang;
import com.qc.ssm.po.jfq.JifenqiangExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface JifenqiangMapper {
    int countByExample(JifenqiangExample example);

    int deleteByExample(JifenqiangExample example);

    int deleteByPrimaryKey(String id);

    int insert(Jifenqiang record);

    int insertSelective(Jifenqiang record);

    List<Jifenqiang> selectByExample(JifenqiangExample example);

    Jifenqiang selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Jifenqiang record, @Param("example") JifenqiangExample example);

    int updateByExample(@Param("record") Jifenqiang record, @Param("example") JifenqiangExample example);

    int updateByPrimaryKeySelective(Jifenqiang record);

    int updateByPrimaryKey(Jifenqiang record);
    
    List<Jifenqiang> getJson(Map<String, Object> map);

    List<Jifenqiang> getJsonById(Map<String, Object> map);
}