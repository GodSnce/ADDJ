package com.qc.ssm.utils;

import com.qc.ssm.request.HttpRequest;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    public static Date getDate(long time){

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(Long.parseLong(String.valueOf(time)));
//        String format = sdf.format(new Date(Long.parseLong(String.valueOf(time))));
//System.out.println(date);
//System.out.println(format);
        return date;

    }

    public static Date getDateN(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long timeStamp = System.currentTimeMillis();
        Date date = new Date(Long.parseLong(String.valueOf(timeStamp)));
        return date;
    }

    public static long getDateNum(){

        long timeStamp = System.currentTimeMillis();
        return timeStamp;

    }


    @Test
    public void test(){
        String s = HttpRequest.sendPost("http://www.dianrui.com/ajax/ajax.php", "action=login&username=sw3@qq.com&password=123456&remember=&code=");
        System.out.println(s);


    }

}
