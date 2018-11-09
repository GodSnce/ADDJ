package com.qc.ssm.po;

import java.util.Date;

public class Appconfig {
    private Integer appid;

    private String url;

    private String param;

    private String status;

    private Date time;

    private String channel;

    private String appname;

    private String cname;

    private String itunesurl;

    private Integer kouliang;

    private String callback;

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname == null ? null : appname.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getItunesurl() {
        return itunesurl;
    }

    public void setItunesurl(String itunesurl) {
        this.itunesurl = itunesurl == null ? null : itunesurl.trim();
    }

    public Integer getKouliang() {
        return kouliang;
    }

    public void setKouliang(Integer kouliang) {
        this.kouliang = kouliang;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback == null ? null : callback.trim();
    }
}