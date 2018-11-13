package com.qc.ssm.service.share;

import com.qc.ssm.po.share.ShareData;

import java.util.List;

public interface ShareDataService {
    List<ShareData> getShareDataByCategory(String category,String type);

    List<ShareData> getImageDetailById(String id);
}
