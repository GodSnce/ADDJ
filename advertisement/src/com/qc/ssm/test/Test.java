package com.qc.ssm.test;

import com.alibaba.fastjson.JSONArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {

        String json = "";

        List<Youxi> youxis = JSONArray.parseArray(json, Youxi.class);

//        JSONArray array = JSONObject.parseArray(json);

        String sql = "";

        ArrayList<String> iconList = new ArrayList<>();
        ArrayList<String> codeList = new ArrayList<>();

        for (int i = 0;i < youxis.size(); i++){
            iconList.add(youxis.get(i).getIcon().getImage());
            codeList.add(youxis.get(i).getQrcode().getImage());
            String[] icons = youxis.get(i).getIcon().getImage().split("/");
            String[] qrcodes = youxis.get(i).getQrcode().getImage().split("/");
            String icon = "/shangke/userfiles/1/images/photo/2018/gameicon/" + icons[icons.length-1];
            String qrcode = "/shangke/userfiles/1/images/photo/2018/gameqrcode/" + qrcodes[qrcodes.length-1];
            sql = sql + "INSERT INTO wx_game(id,created_by,description,developer_message,icon_url,name,qrcode_url,tag,visit_amount) VALUES (" +
                    youxis.get(i).getId() + "," + "'" + youxis.get(i).getCreated_by() + "','" + youxis.get(i).getDescription() + "','" + youxis.get(i).getDeveloper_message() + "','" + icon + "','" + youxis.get(i).getName() + "','" + qrcode + "','" + youxis.get(i).getTag().get(0).getName() + "'," + youxis.get(i).getVisit_amount() + ");";
        }

        DownImg.downloadPicture(iconList,"GameIcon");
        DownImg.downloadPicture(codeList,"GameQrcode");

//        Youxi youxi = array.getObject(0,Youxi.class);

        System.out.println(sql);

    }
}
