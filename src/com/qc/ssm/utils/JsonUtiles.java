package com.qc.ssm.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;


public class JsonUtiles {
    //        JSONObject pageObject = new JSONObject();
//        pageObject.put("pageIndex",1);
//        pageObject.put("pageSize",10);
//        pageObject.put("total",total);
    public static String toJsonList(int total, List list){
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(list));

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("total",total);

        jsonObject.put("rows",jsonArray);

        return jsonObject.toString();

    }

    public static String toJsonString(List list){

        return JSON.toJSONString(list);

    }

}
