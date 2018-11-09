package com.qc.ssm.mapper;

import com.qc.ssm.po.Paichong;
import com.qc.ssm.po.PaichongExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PaichongMapper {
    int countByExample(PaichongExample example);

    int deleteByExample(PaichongExample example);

    int insert(Paichong record);

    int insertSelective(Paichong record);

    List<Paichong> selectByExample(PaichongExample example);

    int updateByExampleSelective(@Param("record") Paichong record, @Param("example") PaichongExample example);

    int updateByExample(@Param("record") Paichong record, @Param("example") PaichongExample example);

    List<Paichong> selectByIdfa(Map<String, Object> map);
}