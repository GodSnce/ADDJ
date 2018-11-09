package com.qc.ssm.po.displayAds;

public class Clickads {
    private Integer id;

    private String appid;

    private String url;

    private String android;

    private String ios;

    private String imgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getAndroid() {
        return android;
    }

    public void setAndroid(String android) {
        this.android = android == null ? null : android.trim();
    }

    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios == null ? null : ios.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}