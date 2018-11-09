package com.qc.ssm.test;

import java.util.Date;
import java.util.List;

public class Youxi {

    //公告
    private String announcement;
    //创建时间
    private Date created_at;
    //创建人
    private String created_by;
    //描述
    private String description;
    //开发者信息
    private String developer_message;
    private Youxi_icon icon;

    public Youxi_icon getIcon() {
        return icon;
    }

    public void setIcon(Youxi_icon icon) {
        this.icon = icon;
    }

    private int id;
    private boolean is_poi;
    //是否推荐
    private boolean is_recommended;
    private String[] label;
    private String mp_qrcode;
    //名称
    private String name;
    //总体评分
    private int overall_rating;
    //二维码
    private Youxi_qrcode qrcode;

    public Youxi_qrcode getQrcode() {
        return qrcode;
    }

    public void setQrcode(Youxi_qrcode qrcode) {
        this.qrcode = qrcode;
    }

    //评分
    private int[] rating;
    //推荐理由
    private String recommendation_reason;
    //推荐位置
    private String recommended_at;
    //发布状态
    private String release_status;
    //声誉
    private String reputation;
    //预订成功提示
    private String reservation_success_tip;
    //资源地址
    private String resource_uri;
    //截图
    private List<Youxi_screenshot> screenshot;
    //标签
    private List<Youxi_tag> tag;
    private String url;
    //视频链接
    private String video_url;
    //访问量
    private int visit_amount;
    //微信号
    private String wx_number;

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveloper_message() {
        return developer_message;
    }

    public void setDeveloper_message(String developer_message) {
        this.developer_message = developer_message;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_poi() {
        return is_poi;
    }

    public void setIs_poi(boolean is_poi) {
        this.is_poi = is_poi;
    }

    public boolean isIs_recommended() {
        return is_recommended;
    }

    public void setIs_recommended(boolean is_recommended) {
        this.is_recommended = is_recommended;
    }

    public String[] getLabel() {
        return label;
    }

    public void setLabel(String[] label) {
        this.label = label;
    }

    public String getMp_qrcode() {
        return mp_qrcode;
    }

    public void setMp_qrcode(String mp_qrcode) {
        this.mp_qrcode = mp_qrcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOverall_rating() {
        return overall_rating;
    }

    public void setOverall_rating(int overall_rating) {
        this.overall_rating = overall_rating;
    }



    public int[] getRating() {
        return rating;
    }

    public void setRating(int[] rating) {
        this.rating = rating;
    }

    public String getRecommendation_reason() {
        return recommendation_reason;
    }

    public void setRecommendation_reason(String recommendation_reason) {
        this.recommendation_reason = recommendation_reason;
    }

    public String getRecommended_at() {
        return recommended_at;
    }

    public void setRecommended_at(String recommended_at) {
        this.recommended_at = recommended_at;
    }

    public String getRelease_status() {
        return release_status;
    }

    public void setRelease_status(String release_status) {
        this.release_status = release_status;
    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    public String getReservation_success_tip() {
        return reservation_success_tip;
    }

    public void setReservation_success_tip(String reservation_success_tip) {
        this.reservation_success_tip = reservation_success_tip;
    }

    public String getResource_uri() {
        return resource_uri;
    }

    public void setResource_uri(String resource_uri) {
        this.resource_uri = resource_uri;
    }

    public List<Youxi_screenshot> getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(List<Youxi_screenshot> screenshot) {
        this.screenshot = screenshot;
    }

    public List<Youxi_tag> getTag() {
        return tag;
    }

    public void setTag(List<Youxi_tag> tag) {
        this.tag = tag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public int getVisit_amount() {
        return visit_amount;
    }

    public void setVisit_amount(int visit_amount) {
        this.visit_amount = visit_amount;
    }

    public String getWx_number() {
        return wx_number;
    }

    public void setWx_number(String wx_number) {
        this.wx_number = wx_number;
    }
}
