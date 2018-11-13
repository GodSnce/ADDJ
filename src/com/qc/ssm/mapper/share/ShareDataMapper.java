package com.qc.ssm.mapper.share;

import com.qc.ssm.po.share.ShareData;
import com.qc.ssm.po.share.ShareDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ShareDataMapper {
    int countByExample(ShareDataExample example);

    int deleteByExample(ShareDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShareData record);

    int insertSelective(ShareData record);

    List<ShareData> selectByExample(ShareDataExample example);

    ShareData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShareData record, @Param("example") ShareDataExample example);

    int updateByExample(@Param("record") ShareData record, @Param("example") ShareDataExample example);

    int updateByPrimaryKeySelective(ShareData record);

    int updateByPrimaryKey(ShareData record);
    
    List<ShareData> getShareDataByCategory(Map map);

    List<ShareData> getImageDetailById(Map map);
}