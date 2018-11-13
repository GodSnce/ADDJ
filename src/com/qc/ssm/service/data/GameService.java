package com.qc.ssm.service.data;

import com.qc.ssm.po.Gconfig;
import com.qc.ssm.po.Gdata;

import java.util.List;

public interface GameService {
    List<Gconfig> queryGameConfig(int begin,int rows);

    List<Gdata> queryGameData();

    boolean saveGameConfig(Gconfig gconfig);

    int queryGameConfigCount();

}
