package com.qc.ssm.mapper.share;

import com.qc.ssm.po.share.ShareDataMiniProgram;
import com.qc.ssm.po.share.ShareDataMiniProgramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShareDataMiniProgramMapper {
    int countByExample(ShareDataMiniProgramExample example);

    int deleteByExample(ShareDataMiniProgramExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShareDataMiniProgram record);

    int insertSelective(ShareDataMiniProgram record);

    List<ShareDataMiniProgram> selectByExample(ShareDataMiniProgramExample example);

    ShareDataMiniProgram selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShareDataMiniProgram record, @Param("example") ShareDataMiniProgramExample example);

    int updateByExample(@Param("record") ShareDataMiniProgram record, @Param("example") ShareDataMiniProgramExample example);

    int updateByPrimaryKeySelective(ShareDataMiniProgram record);

    int updateByPrimaryKey(ShareDataMiniProgram record);
}