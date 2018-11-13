package com.qc.ssm.service.oa;

import com.qc.ssm.po.Menu;
import com.qc.ssm.po.User;

import java.util.List;

public interface UserService {

    //查询分页数据
    List<User> queryUser(int begin, int rows);

    //查询分页条数
    int queryCount();

    List<Menu> getTopMenu();
}
