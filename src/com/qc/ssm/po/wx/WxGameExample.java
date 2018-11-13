package com.qc.ssm.po.wx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxGameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxGameExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIsNull() {
            addCriterion("announcement is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIsNotNull() {
            addCriterion("announcement is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementEqualTo(String value) {
            addCriterion("announcement =", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotEqualTo(String value) {
            addCriterion("announcement <>", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementGreaterThan(String value) {
            addCriterion("announcement >", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementGreaterThanOrEqualTo(String value) {
            addCriterion("announcement >=", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLessThan(String value) {
            addCriterion("announcement <", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLessThanOrEqualTo(String value) {
            addCriterion("announcement <=", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLike(String value) {
            addCriterion("announcement like", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotLike(String value) {
            addCriterion("announcement not like", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIn(List<String> values) {
            addCriterion("announcement in", values, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotIn(List<String> values) {
            addCriterion("announcement not in", values, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementBetween(String value1, String value2) {
            addCriterion("announcement between", value1, value2, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotBetween(String value1, String value2) {
            addCriterion("announcement not between", value1, value2, "announcement");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageIsNull() {
            addCriterion("developer_message is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageIsNotNull() {
            addCriterion("developer_message is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageEqualTo(String value) {
            addCriterion("developer_message =", value, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageNotEqualTo(String value) {
            addCriterion("developer_message <>", value, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageGreaterThan(String value) {
            addCriterion("developer_message >", value, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageGreaterThanOrEqualTo(String value) {
            addCriterion("developer_message >=", value, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageLessThan(String value) {
            addCriterion("developer_message <", value, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageLessThanOrEqualTo(String value) {
            addCriterion("developer_message <=", value, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageLike(String value) {
            addCriterion("developer_message like", value, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageNotLike(String value) {
            addCriterion("developer_message not like", value, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageIn(List<String> values) {
            addCriterion("developer_message in", values, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageNotIn(List<String> values) {
            addCriterion("developer_message not in", values, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageBetween(String value1, String value2) {
            addCriterion("developer_message between", value1, value2, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andDeveloperMessageNotBetween(String value1, String value2) {
            addCriterion("developer_message not between", value1, value2, "developerMessage");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("icon_url is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("icon_url =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("icon_url <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("icon_url >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("icon_url >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("icon_url <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("icon_url <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("icon_url like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("icon_url not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("icon_url in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("icon_url not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("icon_url between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("icon_url not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIsPoiIsNull() {
            addCriterion("is_poi is null");
            return (Criteria) this;
        }

        public Criteria andIsPoiIsNotNull() {
            addCriterion("is_poi is not null");
            return (Criteria) this;
        }

        public Criteria andIsPoiEqualTo(Boolean value) {
            addCriterion("is_poi =", value, "isPoi");
            return (Criteria) this;
        }

        public Criteria andIsPoiNotEqualTo(Boolean value) {
            addCriterion("is_poi <>", value, "isPoi");
            return (Criteria) this;
        }

        public Criteria andIsPoiGreaterThan(Boolean value) {
            addCriterion("is_poi >", value, "isPoi");
            return (Criteria) this;
        }

        public Criteria andIsPoiGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_poi >=", value, "isPoi");
            return (Criteria) this;
        }

        public Criteria andIsPoiLessThan(Boolean value) {
            addCriterion("is_poi <", value, "isPoi");
            return (Criteria) this;
        }

        public Criteria andIsPoiLessThanOrEqualTo(Boolean value) {
            addCriterion("is_poi <=", value, "isPoi");
            return (Criteria) this;
        }

        public Criteria andIsPoiIn(List<Boolean> values) {
            addCriterion("is_poi in", values, "isPoi");
            return (Criteria) this;
        }

        public Criteria andIsPoiNotIn(List<Boolean> values) {
            addCriterion("is_poi not in", values, "isPoi");
            return (Criteria) this;
        }

        public Criteria andIsPoiBetween(Boolean value1, Boolean value2) {
            addCriterion("is_poi between", value1, value2, "isPoi");
            return (Criteria) this;
        }

        public Criteria andIsPoiNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_poi not between", value1, value2, "isPoi");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOverallRatingIsNull() {
            addCriterion("overall_rating is null");
            return (Criteria) this;
        }

        public Criteria andOverallRatingIsNotNull() {
            addCriterion("overall_rating is not null");
            return (Criteria) this;
        }

        public Criteria andOverallRatingEqualTo(Integer value) {
            addCriterion("overall_rating =", value, "overallRating");
            return (Criteria) this;
        }

        public Criteria andOverallRatingNotEqualTo(Integer value) {
            addCriterion("overall_rating <>", value, "overallRating");
            return (Criteria) this;
        }

        public Criteria andOverallRatingGreaterThan(Integer value) {
            addCriterion("overall_rating >", value, "overallRating");
            return (Criteria) this;
        }

        public Criteria andOverallRatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("overall_rating >=", value, "overallRating");
            return (Criteria) this;
        }

        public Criteria andOverallRatingLessThan(Integer value) {
            addCriterion("overall_rating <", value, "overallRating");
            return (Criteria) this;
        }

        public Criteria andOverallRatingLessThanOrEqualTo(Integer value) {
            addCriterion("overall_rating <=", value, "overallRating");
            return (Criteria) this;
        }

        public Criteria andOverallRatingIn(List<Integer> values) {
            addCriterion("overall_rating in", values, "overallRating");
            return (Criteria) this;
        }

        public Criteria andOverallRatingNotIn(List<Integer> values) {
            addCriterion("overall_rating not in", values, "overallRating");
            return (Criteria) this;
        }

        public Criteria andOverallRatingBetween(Integer value1, Integer value2) {
            addCriterion("overall_rating between", value1, value2, "overallRating");
            return (Criteria) this;
        }

        public Criteria andOverallRatingNotBetween(Integer value1, Integer value2) {
            addCriterion("overall_rating not between", value1, value2, "overallRating");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNull() {
            addCriterion("qrcode_url is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNotNull() {
            addCriterion("qrcode_url is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlEqualTo(String value) {
            addCriterion("qrcode_url =", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotEqualTo(String value) {
            addCriterion("qrcode_url <>", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThan(String value) {
            addCriterion("qrcode_url >", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_url >=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThan(String value) {
            addCriterion("qrcode_url <", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThanOrEqualTo(String value) {
            addCriterion("qrcode_url <=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLike(String value) {
            addCriterion("qrcode_url like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotLike(String value) {
            addCriterion("qrcode_url not like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIn(List<String> values) {
            addCriterion("qrcode_url in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotIn(List<String> values) {
            addCriterion("qrcode_url not in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlBetween(String value1, String value2) {
            addCriterion("qrcode_url between", value1, value2, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotBetween(String value1, String value2) {
            addCriterion("qrcode_url not between", value1, value2, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andRatingIsNull() {
            addCriterion("rating is null");
            return (Criteria) this;
        }

        public Criteria andRatingIsNotNull() {
            addCriterion("rating is not null");
            return (Criteria) this;
        }

        public Criteria andRatingEqualTo(Integer value) {
            addCriterion("rating =", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotEqualTo(Integer value) {
            addCriterion("rating <>", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThan(Integer value) {
            addCriterion("rating >", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("rating >=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThan(Integer value) {
            addCriterion("rating <", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThanOrEqualTo(Integer value) {
            addCriterion("rating <=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingIn(List<Integer> values) {
            addCriterion("rating in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotIn(List<Integer> values) {
            addCriterion("rating not in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingBetween(Integer value1, Integer value2) {
            addCriterion("rating between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotBetween(Integer value1, Integer value2) {
            addCriterion("rating not between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonIsNull() {
            addCriterion("recommendation_reason is null");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonIsNotNull() {
            addCriterion("recommendation_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonEqualTo(String value) {
            addCriterion("recommendation_reason =", value, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonNotEqualTo(String value) {
            addCriterion("recommendation_reason <>", value, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonGreaterThan(String value) {
            addCriterion("recommendation_reason >", value, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonGreaterThanOrEqualTo(String value) {
            addCriterion("recommendation_reason >=", value, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonLessThan(String value) {
            addCriterion("recommendation_reason <", value, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonLessThanOrEqualTo(String value) {
            addCriterion("recommendation_reason <=", value, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonLike(String value) {
            addCriterion("recommendation_reason like", value, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonNotLike(String value) {
            addCriterion("recommendation_reason not like", value, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonIn(List<String> values) {
            addCriterion("recommendation_reason in", values, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonNotIn(List<String> values) {
            addCriterion("recommendation_reason not in", values, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonBetween(String value1, String value2) {
            addCriterion("recommendation_reason between", value1, value2, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendationReasonNotBetween(String value1, String value2) {
            addCriterion("recommendation_reason not between", value1, value2, "recommendationReason");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtIsNull() {
            addCriterion("recommended_at is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtIsNotNull() {
            addCriterion("recommended_at is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtEqualTo(String value) {
            addCriterion("recommended_at =", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtNotEqualTo(String value) {
            addCriterion("recommended_at <>", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtGreaterThan(String value) {
            addCriterion("recommended_at >", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtGreaterThanOrEqualTo(String value) {
            addCriterion("recommended_at >=", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtLessThan(String value) {
            addCriterion("recommended_at <", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtLessThanOrEqualTo(String value) {
            addCriterion("recommended_at <=", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtLike(String value) {
            addCriterion("recommended_at like", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtNotLike(String value) {
            addCriterion("recommended_at not like", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtIn(List<String> values) {
            addCriterion("recommended_at in", values, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtNotIn(List<String> values) {
            addCriterion("recommended_at not in", values, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtBetween(String value1, String value2) {
            addCriterion("recommended_at between", value1, value2, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtNotBetween(String value1, String value2) {
            addCriterion("recommended_at not between", value1, value2, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusIsNull() {
            addCriterion("release_status is null");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusIsNotNull() {
            addCriterion("release_status is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusEqualTo(String value) {
            addCriterion("release_status =", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusNotEqualTo(String value) {
            addCriterion("release_status <>", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusGreaterThan(String value) {
            addCriterion("release_status >", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("release_status >=", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusLessThan(String value) {
            addCriterion("release_status <", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusLessThanOrEqualTo(String value) {
            addCriterion("release_status <=", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusLike(String value) {
            addCriterion("release_status like", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusNotLike(String value) {
            addCriterion("release_status not like", value, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusIn(List<String> values) {
            addCriterion("release_status in", values, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusNotIn(List<String> values) {
            addCriterion("release_status not in", values, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusBetween(String value1, String value2) {
            addCriterion("release_status between", value1, value2, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReleaseStatusNotBetween(String value1, String value2) {
            addCriterion("release_status not between", value1, value2, "releaseStatus");
            return (Criteria) this;
        }

        public Criteria andReputationIsNull() {
            addCriterion("reputation is null");
            return (Criteria) this;
        }

        public Criteria andReputationIsNotNull() {
            addCriterion("reputation is not null");
            return (Criteria) this;
        }

        public Criteria andReputationEqualTo(String value) {
            addCriterion("reputation =", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotEqualTo(String value) {
            addCriterion("reputation <>", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationGreaterThan(String value) {
            addCriterion("reputation >", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationGreaterThanOrEqualTo(String value) {
            addCriterion("reputation >=", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLessThan(String value) {
            addCriterion("reputation <", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLessThanOrEqualTo(String value) {
            addCriterion("reputation <=", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLike(String value) {
            addCriterion("reputation like", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotLike(String value) {
            addCriterion("reputation not like", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationIn(List<String> values) {
            addCriterion("reputation in", values, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotIn(List<String> values) {
            addCriterion("reputation not in", values, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationBetween(String value1, String value2) {
            addCriterion("reputation between", value1, value2, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotBetween(String value1, String value2) {
            addCriterion("reputation not between", value1, value2, "reputation");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlIsNull() {
            addCriterion("screenshot_url is null");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlIsNotNull() {
            addCriterion("screenshot_url is not null");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlEqualTo(String value) {
            addCriterion("screenshot_url =", value, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlNotEqualTo(String value) {
            addCriterion("screenshot_url <>", value, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlGreaterThan(String value) {
            addCriterion("screenshot_url >", value, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlGreaterThanOrEqualTo(String value) {
            addCriterion("screenshot_url >=", value, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlLessThan(String value) {
            addCriterion("screenshot_url <", value, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlLessThanOrEqualTo(String value) {
            addCriterion("screenshot_url <=", value, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlLike(String value) {
            addCriterion("screenshot_url like", value, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlNotLike(String value) {
            addCriterion("screenshot_url not like", value, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlIn(List<String> values) {
            addCriterion("screenshot_url in", values, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlNotIn(List<String> values) {
            addCriterion("screenshot_url not in", values, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlBetween(String value1, String value2) {
            addCriterion("screenshot_url between", value1, value2, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andScreenshotUrlNotBetween(String value1, String value2) {
            addCriterion("screenshot_url not between", value1, value2, "screenshotUrl");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVisitAmountIsNull() {
            addCriterion("visit_amount is null");
            return (Criteria) this;
        }

        public Criteria andVisitAmountIsNotNull() {
            addCriterion("visit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andVisitAmountEqualTo(Integer value) {
            addCriterion("visit_amount =", value, "visitAmount");
            return (Criteria) this;
        }

        public Criteria andVisitAmountNotEqualTo(Integer value) {
            addCriterion("visit_amount <>", value, "visitAmount");
            return (Criteria) this;
        }

        public Criteria andVisitAmountGreaterThan(Integer value) {
            addCriterion("visit_amount >", value, "visitAmount");
            return (Criteria) this;
        }

        public Criteria andVisitAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("visit_amount >=", value, "visitAmount");
            return (Criteria) this;
        }

        public Criteria andVisitAmountLessThan(Integer value) {
            addCriterion("visit_amount <", value, "visitAmount");
            return (Criteria) this;
        }

        public Criteria andVisitAmountLessThanOrEqualTo(Integer value) {
            addCriterion("visit_amount <=", value, "visitAmount");
            return (Criteria) this;
        }

        public Criteria andVisitAmountIn(List<Integer> values) {
            addCriterion("visit_amount in", values, "visitAmount");
            return (Criteria) this;
        }

        public Criteria andVisitAmountNotIn(List<Integer> values) {
            addCriterion("visit_amount not in", values, "visitAmount");
            return (Criteria) this;
        }

        public Criteria andVisitAmountBetween(Integer value1, Integer value2) {
            addCriterion("visit_amount between", value1, value2, "visitAmount");
            return (Criteria) this;
        }

        public Criteria andVisitAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("visit_amount not between", value1, value2, "visitAmount");
            return (Criteria) this;
        }

        public Criteria andWxNumberIsNull() {
            addCriterion("wx_number is null");
            return (Criteria) this;
        }

        public Criteria andWxNumberIsNotNull() {
            addCriterion("wx_number is not null");
            return (Criteria) this;
        }

        public Criteria andWxNumberEqualTo(String value) {
            addCriterion("wx_number =", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberNotEqualTo(String value) {
            addCriterion("wx_number <>", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberGreaterThan(String value) {
            addCriterion("wx_number >", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("wx_number >=", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberLessThan(String value) {
            addCriterion("wx_number <", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberLessThanOrEqualTo(String value) {
            addCriterion("wx_number <=", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberLike(String value) {
            addCriterion("wx_number like", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberNotLike(String value) {
            addCriterion("wx_number not like", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberIn(List<String> values) {
            addCriterion("wx_number in", values, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberNotIn(List<String> values) {
            addCriterion("wx_number not in", values, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberBetween(String value1, String value2) {
            addCriterion("wx_number between", value1, value2, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberNotBetween(String value1, String value2) {
            addCriterion("wx_number not between", value1, value2, "wxNumber");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}