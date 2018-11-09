package com.qc.ssm.po.share;

import java.util.List;

public class ShareData {
    private String id;

    private Byte enable;

    private Integer level;

    private String type;

    private String name;

    private String title;

    private String descript;

    private Byte infavs;

    private Byte inlikes;

    private String shareLink;

    private Integer likes;

    private Integer comments;

    private Integer shareCount;

    private String dispalyTitle;

    private Integer favCount;

    private Integer readCount;

    private Byte isGoodsNote;

    private String modelType;

    private Double cursorScore;

    private String category;
    
    
    private List<ShareDataImage> shareDataImages;
    private List<ShareDataVideo> shareDataVideos;
    private List<ShareDataMiniProgram> shareDataMiniPrograms;

    public List<ShareDataImage> getShareDataImages() {
        return shareDataImages;
    }

    public void setShareDataImages(List<ShareDataImage> shareDataImages) {
        this.shareDataImages = shareDataImages;
    }

    public List<ShareDataVideo> getShareDataVideos() {
        return shareDataVideos;
    }

    public void setShareDataVideos(List<ShareDataVideo> shareDataVideos) {
        this.shareDataVideos = shareDataVideos;
    }

    public List<ShareDataMiniProgram> getShareDataMiniPrograms() {
        return shareDataMiniPrograms;
    }

    public void setShareDataMiniPrograms(List<ShareDataMiniProgram> shareDataMiniPrograms) {
        this.shareDataMiniPrograms = shareDataMiniPrograms;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Byte getEnable() {
        return enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    public Byte getInfavs() {
        return infavs;
    }

    public void setInfavs(Byte infavs) {
        this.infavs = infavs;
    }

    public Byte getInlikes() {
        return inlikes;
    }

    public void setInlikes(Byte inlikes) {
        this.inlikes = inlikes;
    }

    public String getShareLink() {
        return shareLink;
    }

    public void setShareLink(String shareLink) {
        this.shareLink = shareLink == null ? null : shareLink.trim();
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public String getDispalyTitle() {
        return dispalyTitle;
    }

    public void setDispalyTitle(String dispalyTitle) {
        this.dispalyTitle = dispalyTitle == null ? null : dispalyTitle.trim();
    }

    public Integer getFavCount() {
        return favCount;
    }

    public void setFavCount(Integer favCount) {
        this.favCount = favCount;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Byte getIsGoodsNote() {
        return isGoodsNote;
    }

    public void setIsGoodsNote(Byte isGoodsNote) {
        this.isGoodsNote = isGoodsNote;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType == null ? null : modelType.trim();
    }

    public Double getCursorScore() {
        return cursorScore;
    }

    public void setCursorScore(Double cursorScore) {
        this.cursorScore = cursorScore;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }
}