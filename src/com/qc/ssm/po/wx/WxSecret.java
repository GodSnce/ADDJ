package com.qc.ssm.po.wx;

import java.util.Date;

public class WxSecret {
    private String id;

    private String nikename;

    private String tximage;

    private String city;

    private String province;

    private String country;

    private String language;

    private String title;

    private String bgcolour;

    private String fontcolour;

    private Date time;

    private String ext1;

    private String ext2;

    private String ext3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename == null ? null : nikename.trim();
    }

    public String getTximage() {
        return tximage;
    }

    public void setTximage(String tximage) {
        this.tximage = tximage == null ? null : tximage.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBgcolour() {
        return bgcolour;
    }

    public void setBgcolour(String bgcolour) {
        this.bgcolour = bgcolour == null ? null : bgcolour.trim();
    }

    public String getFontcolour() {
        return fontcolour;
    }

    public void setFontcolour(String fontcolour) {
        this.fontcolour = fontcolour == null ? null : fontcolour.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }
}