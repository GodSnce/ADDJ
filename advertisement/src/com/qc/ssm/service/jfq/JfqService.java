package com.qc.ssm.service.jfq;

import com.qc.ssm.po.jfq.Jifenqiang;

import java.util.List;

public interface JfqService {
    List<Jifenqiang> getJson(String state);

    List<Jifenqiang> getJsonById(String id);
}
