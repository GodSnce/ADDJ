package com.qc.ssm.test;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class DownImg {

    public static void downloadPicture(ArrayList<String> urlList,String path) throws IOException {
        int imageNumber = 0;
        String savePath = "f:\\image\\"+path+"\\";
        ArrayList<String> list = new ArrayList<String>();
        for (String urlString : urlList) {

            String[] split = urlString.split("/");
            String filename = split[split.length-1];

            list.add(filename);

            URL url = new URL(urlString);
            // 打开连接
            URLConnection con = url.openConnection();
            //设置请求超时为5s
            con.setConnectTimeout(5*1000);
            // 输入流
            InputStream is = con.getInputStream();

            // 1K的数据缓冲
            byte[] bs = new byte[1024];
            // 读取到的数据长度
            int len;
            // 输出的文件流
            File sf=new File(savePath);
            if(!sf.exists()){
                sf.mkdirs();
            }
            OutputStream os = new FileOutputStream(sf.getPath()+"\\"+filename);
            // 开始读取
            while ((len = is.read(bs)) != -1) {
                os.write(bs, 0, len);
            }
            // 完毕，关闭所有链接
            os.close();
            is.close();

        }

        System.out.println(list);
    }


    public static void downloadPicture2(String s) throws IOException {
        int imageNumber = 0;
        String savePath = "f:\\image\\qrcode\\";

            String[] split = s.split("/");
            String filename = split[3] + ".png";

            URL url = new URL(s);
            // 打开连接
            URLConnection con = url.openConnection();
            //设置请求超时为5s
            con.setConnectTimeout(5*1000);
            // 输入流
            InputStream is = con.getInputStream();

            // 1K的数据缓冲
            byte[] bs = new byte[1024];
            // 读取到的数据长度
            int len;
            // 输出的文件流
            File sf=new File(savePath);
            if(!sf.exists()){
                sf.mkdirs();
            }
            OutputStream os = new FileOutputStream(sf.getPath()+"\\"+filename);
            // 开始读取
            while ((len = is.read(bs)) != -1) {
                os.write(bs, 0, len);
            }
            // 完毕，关闭所有链接
            os.close();
            is.close();


        System.out.println(s);
    }

    public static void main(String[] args){
        String s = "http://qimg.91ud.com/FrS68kKPXK15FGtutJ2WvIFVGYUt/256";
        String[] split = s.split("/");
        System.out.println(split[3]);
    }


}
