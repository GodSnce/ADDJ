package com.qc.ssm.service.oa.impl;

import com.qc.ssm.mapper.MenuMapper;
import com.qc.ssm.mapper.UserMapper;
import com.qc.ssm.po.Menu;
import com.qc.ssm.po.User;
import com.qc.ssm.service.oa.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<User> queryUser(int begin, int rows) {

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("begin",begin);
        map.put("rows",rows);

        List<User> list = userMapper.queryUser(map);

        return list;
    }

    @Override
    public int queryCount() {

        int count = userMapper.queryCount();

        return count;
    }

    //获取顶部菜单
    @Override
    public List<Menu> getTopMenu() {

        List<Menu> menus = menuMapper.selectMenu();

        return menus;
    }
}
