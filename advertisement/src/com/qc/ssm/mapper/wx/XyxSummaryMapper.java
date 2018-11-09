package com.qc.ssm.mapper.wx;

import com.qc.ssm.po.wx.XyxSummary;
import com.qc.ssm.po.wx.XyxSummaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface XyxSummaryMapper {
    int countByExample(XyxSummaryExample example);

    int deleteByExample(XyxSummaryExample example);

    int deleteByPrimaryKey(String id);

    int insert(XyxSummary record);

    int insertSelective(XyxSummary record);

    List<XyxSummary> selectByExample(XyxSummaryExample example);

    XyxSummary selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XyxSummary record, @Param("example") XyxSummaryExample example);

    int updateByExample(@Param("record") XyxSummary record, @Param("example") XyxSummaryExample example);

    int updateByPrimaryKeySelective(XyxSummary record);

    int updateByPrimaryKey(XyxSummary record);

    List<XyxSummary> selectAll(Map<String, Integer> map);

    List<XyxSummary> getXyxByFenlei(Map<String, String> map);
}