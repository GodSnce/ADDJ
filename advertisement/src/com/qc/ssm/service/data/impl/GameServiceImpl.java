package com.qc.ssm.service.data.impl;

import com.qc.ssm.mapper.GconfigMapper;
import com.qc.ssm.mapper.GdataMapper;
import com.qc.ssm.po.Gconfig;
import com.qc.ssm.po.Gdata;
import com.qc.ssm.service.data.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GconfigMapper gconfigMapper;

    @Autowired
    private GdataMapper gdataMapper;

    @Override
    public List<Gconfig> queryGameConfig(int begin,int rows) {

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("begin",begin);
        map.put("rows",rows);

        List<Gconfig> list = gconfigMapper.queryGconfig(map);

        return list;
    }

    @Override
    public List<Gdata> queryGameData() {

        List<Gdata> list = gdataMapper.queryGameData();

        return list;
    }

    @Override
    public boolean saveGameConfig(Gconfig gconfig) {

        int insert = gconfigMapper.insert(gconfig);

        if (insert > 0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 查询分页时的总数
     * @return
     */
    @Override
    public int queryGameConfigCount() {

        int total = gconfigMapper.queryGameConfigCount();

        return total;
    }


}
