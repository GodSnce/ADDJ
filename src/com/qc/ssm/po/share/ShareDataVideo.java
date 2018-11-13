package com.qc.ssm.po.share;

public class ShareDataVideo {
    private String id;

    private Integer playedCount;

    private String videoUrl;

    private Integer height;

    private Integer width;

    private String gifUrl;

    private String shareDataId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getPlayedCount() {
        return playedCount;
    }

    public void setPlayedCount(Integer playedCount) {
        this.playedCount = playedCount;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
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

    public String getGifUrl() {
        return gifUrl;
    }

    public void setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl == null ? null : gifUrl.trim();
    }

    public String getShareDataId() {
        return shareDataId;
    }

    public void setShareDataId(String shareDataId) {
        this.shareDataId = shareDataId == null ? null : shareDataId.trim();
    }
}