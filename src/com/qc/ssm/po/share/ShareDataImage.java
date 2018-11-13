package com.qc.ssm.po.share;

public class ShareDataImage {
    private String fileid;

    private Integer height;

    private Integer width;

    private String url;

    private String original;

    private String urlSizeLarge;

    private String shareDataId;

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original == null ? null : original.trim();
    }

    public String getUrlSizeLarge() {
        return urlSizeLarge;
    }

    public void setUrlSizeLarge(String urlSizeLarge) {
        this.urlSizeLarge = urlSizeLarge == null ? null : urlSizeLarge.trim();
    }

    public String getShareDataId() {
        return shareDataId;
    }

    public void setShareDataId(String shareDataId) {
        this.shareDataId = shareDataId == null ? null : shareDataId.trim();
    }
}