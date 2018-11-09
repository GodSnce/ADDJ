package com.qc.ssm.mapper.share;

import com.qc.ssm.po.share.ShareDataVideo;
import com.qc.ssm.po.share.ShareDataVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShareDataVideoMapper {
    int countByExample(ShareDataVideoExample example);

    int deleteByExample(ShareDataVideoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShareDataVideo record);

    int insertSelective(ShareDataVideo record);

    List<ShareDataVideo> selectByExample(ShareDataVideoExample example);

    ShareDataVideo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShareDataVideo record, @Param("example") ShareDataVideoExample example);

    int updateByExample(@Param("record") ShareDataVideo record, @Param("example") ShareDataVideoExample example);

    int updateByPrimaryKeySelective(ShareDataVideo record);

    int updateByPrimaryKey(ShareDataVideo record);
}