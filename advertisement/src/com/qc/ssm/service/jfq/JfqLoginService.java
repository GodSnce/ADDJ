package com.qc.ssm.service.jfq;

import com.qc.ssm.po.jfq.JfqUser;

import java.util.List;

public interface JfqLoginService {

    List<JfqUser> findUserByIdfa(String idfa);

    boolean insert(JfqUser jfqUser);
}
