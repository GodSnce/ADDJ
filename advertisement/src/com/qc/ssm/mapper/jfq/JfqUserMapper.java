package com.qc.ssm.mapper.jfq;

import com.qc.ssm.po.jfq.JfqUser;
import com.qc.ssm.po.jfq.JfqUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface JfqUserMapper {
    int countByExample(JfqUserExample example);

    int deleteByExample(JfqUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(JfqUser record);

    int insertSelective(JfqUser record);

    List<JfqUser> selectByExample(JfqUserExample example);

    JfqUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JfqUser record, @Param("example") JfqUserExample example);

    int updateByExample(@Param("record") JfqUser record, @Param("example") JfqUserExample example);

    int updateByPrimaryKeySelective(JfqUser record);

    int updateByPrimaryKey(JfqUser record);

    List<JfqUser> findUserByIdfa(Map<String, String> map);
}