package com.qc.ssm.mapper.share;

import com.qc.ssm.po.share.ShareDataImage;
import com.qc.ssm.po.share.ShareDataImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShareDataImageMapper {
    int countByExample(ShareDataImageExample example);

    int deleteByExample(ShareDataImageExample example);

    int deleteByPrimaryKey(String fileid);

    int insert(ShareDataImage record);

    int insertSelective(ShareDataImage record);

    List<ShareDataImage> selectByExample(ShareDataImageExample example);

    ShareDataImage selectByPrimaryKey(String fileid);

    int updateByExampleSelective(@Param("record") ShareDataImage record, @Param("example") ShareDataImageExample example);

    int updateByExample(@Param("record") ShareDataImage record, @Param("example") ShareDataImageExample example);

    int updateByPrimaryKeySelective(ShareDataImage record);

    int updateByPrimaryKey(ShareDataImage record);
}