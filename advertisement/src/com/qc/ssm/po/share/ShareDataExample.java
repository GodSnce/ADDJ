package com.qc.ssm.po.share;

import java.util.ArrayList;
import java.util.List;

public class ShareDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShareDataExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Byte value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Byte value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Byte value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Byte value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Byte value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Byte> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Byte> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Byte value1, Byte value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("descript is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("descript is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("descript =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("descript <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("descript >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("descript >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("descript <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("descript <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("descript like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("descript not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("descript in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("descript not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("descript between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("descript not between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andInfavsIsNull() {
            addCriterion("infavs is null");
            return (Criteria) this;
        }

        public Criteria andInfavsIsNotNull() {
            addCriterion("infavs is not null");
            return (Criteria) this;
        }

        public Criteria andInfavsEqualTo(Byte value) {
            addCriterion("infavs =", value, "infavs");
            return (Criteria) this;
        }

        public Criteria andInfavsNotEqualTo(Byte value) {
            addCriterion("infavs <>", value, "infavs");
            return (Criteria) this;
        }

        public Criteria andInfavsGreaterThan(Byte value) {
            addCriterion("infavs >", value, "infavs");
            return (Criteria) this;
        }

        public Criteria andInfavsGreaterThanOrEqualTo(Byte value) {
            addCriterion("infavs >=", value, "infavs");
            return (Criteria) this;
        }

        public Criteria andInfavsLessThan(Byte value) {
            addCriterion("infavs <", value, "infavs");
            return (Criteria) this;
        }

        public Criteria andInfavsLessThanOrEqualTo(Byte value) {
            addCriterion("infavs <=", value, "infavs");
            return (Criteria) this;
        }

        public Criteria andInfavsIn(List<Byte> values) {
            addCriterion("infavs in", values, "infavs");
            return (Criteria) this;
        }

        public Criteria andInfavsNotIn(List<Byte> values) {
            addCriterion("infavs not in", values, "infavs");
            return (Criteria) this;
        }

        public Criteria andInfavsBetween(Byte value1, Byte value2) {
            addCriterion("infavs between", value1, value2, "infavs");
            return (Criteria) this;
        }

        public Criteria andInfavsNotBetween(Byte value1, Byte value2) {
            addCriterion("infavs not between", value1, value2, "infavs");
            return (Criteria) this;
        }

        public Criteria andInlikesIsNull() {
            addCriterion("inlikes is null");
            return (Criteria) this;
        }

        public Criteria andInlikesIsNotNull() {
            addCriterion("inlikes is not null");
            return (Criteria) this;
        }

        public Criteria andInlikesEqualTo(Byte value) {
            addCriterion("inlikes =", value, "inlikes");
            return (Criteria) this;
        }

        public Criteria andInlikesNotEqualTo(Byte value) {
            addCriterion("inlikes <>", value, "inlikes");
            return (Criteria) this;
        }

        public Criteria andInlikesGreaterThan(Byte value) {
            addCriterion("inlikes >", value, "inlikes");
            return (Criteria) this;
        }

        public Criteria andInlikesGreaterThanOrEqualTo(Byte value) {
            addCriterion("inlikes >=", value, "inlikes");
            return (Criteria) this;
        }

        public Criteria andInlikesLessThan(Byte value) {
            addCriterion("inlikes <", value, "inlikes");
            return (Criteria) this;
        }

        public Criteria andInlikesLessThanOrEqualTo(Byte value) {
            addCriterion("inlikes <=", value, "inlikes");
            return (Criteria) this;
        }

        public Criteria andInlikesIn(List<Byte> values) {
            addCriterion("inlikes in", values, "inlikes");
            return (Criteria) this;
        }

        public Criteria andInlikesNotIn(List<Byte> values) {
            addCriterion("inlikes not in", values, "inlikes");
            return (Criteria) this;
        }

        public Criteria andInlikesBetween(Byte value1, Byte value2) {
            addCriterion("inlikes between", value1, value2, "inlikes");
            return (Criteria) this;
        }

        public Criteria andInlikesNotBetween(Byte value1, Byte value2) {
            addCriterion("inlikes not between", value1, value2, "inlikes");
            return (Criteria) this;
        }

        public Criteria andShareLinkIsNull() {
            addCriterion("share_link is null");
            return (Criteria) this;
        }

        public Criteria andShareLinkIsNotNull() {
            addCriterion("share_link is not null");
            return (Criteria) this;
        }

        public Criteria andShareLinkEqualTo(String value) {
            addCriterion("share_link =", value, "shareLink");
            return (Criteria) this;
        }

        public Criteria andShareLinkNotEqualTo(String value) {
            addCriterion("share_link <>", value, "shareLink");
            return (Criteria) this;
        }

        public Criteria andShareLinkGreaterThan(String value) {
            addCriterion("share_link >", value, "shareLink");
            return (Criteria) this;
        }

        public Criteria andShareLinkGreaterThanOrEqualTo(String value) {
            addCriterion("share_link >=", value, "shareLink");
            return (Criteria) this;
        }

        public Criteria andShareLinkLessThan(String value) {
            addCriterion("share_link <", value, "shareLink");
            return (Criteria) this;
        }

        public Criteria andShareLinkLessThanOrEqualTo(String value) {
            addCriterion("share_link <=", value, "shareLink");
            return (Criteria) this;
        }

        public Criteria andShareLinkLike(String value) {
            addCriterion("share_link like", value, "shareLink");
            return (Criteria) this;
        }

        public Criteria andShareLinkNotLike(String value) {
            addCriterion("share_link not like", value, "shareLink");
            return (Criteria) this;
        }

        public Criteria andShareLinkIn(List<String> values) {
            addCriterion("share_link in", values, "shareLink");
            return (Criteria) this;
        }

        public Criteria andShareLinkNotIn(List<String> values) {
            addCriterion("share_link not in", values, "shareLink");
            return (Criteria) this;
        }

        public Criteria andShareLinkBetween(String value1, String value2) {
            addCriterion("share_link between", value1, value2, "shareLink");
            return (Criteria) this;
        }

        public Criteria andShareLinkNotBetween(String value1, String value2) {
            addCriterion("share_link not between", value1, value2, "shareLink");
            return (Criteria) this;
        }

        public Criteria andLikesIsNull() {
            addCriterion("likes is null");
            return (Criteria) this;
        }

        public Criteria andLikesIsNotNull() {
            addCriterion("likes is not null");
            return (Criteria) this;
        }

        public Criteria andLikesEqualTo(Integer value) {
            addCriterion("likes =", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotEqualTo(Integer value) {
            addCriterion("likes <>", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThan(Integer value) {
            addCriterion("likes >", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes >=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThan(Integer value) {
            addCriterion("likes <", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThanOrEqualTo(Integer value) {
            addCriterion("likes <=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesIn(List<Integer> values) {
            addCriterion("likes in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotIn(List<Integer> values) {
            addCriterion("likes not in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesBetween(Integer value1, Integer value2) {
            addCriterion("likes between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotBetween(Integer value1, Integer value2) {
            addCriterion("likes not between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(Integer value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(Integer value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(Integer value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(Integer value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(Integer value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<Integer> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<Integer> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(Integer value1, Integer value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(Integer value1, Integer value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNull() {
            addCriterion("share_count is null");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNotNull() {
            addCriterion("share_count is not null");
            return (Criteria) this;
        }

        public Criteria andShareCountEqualTo(Integer value) {
            addCriterion("share_count =", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotEqualTo(Integer value) {
            addCriterion("share_count <>", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThan(Integer value) {
            addCriterion("share_count >", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_count >=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThan(Integer value) {
            addCriterion("share_count <", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThanOrEqualTo(Integer value) {
            addCriterion("share_count <=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountIn(List<Integer> values) {
            addCriterion("share_count in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotIn(List<Integer> values) {
            addCriterion("share_count not in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountBetween(Integer value1, Integer value2) {
            addCriterion("share_count between", value1, value2, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotBetween(Integer value1, Integer value2) {
            addCriterion("share_count not between", value1, value2, "shareCount");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleIsNull() {
            addCriterion("dispaly_title is null");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleIsNotNull() {
            addCriterion("dispaly_title is not null");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleEqualTo(String value) {
            addCriterion("dispaly_title =", value, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleNotEqualTo(String value) {
            addCriterion("dispaly_title <>", value, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleGreaterThan(String value) {
            addCriterion("dispaly_title >", value, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleGreaterThanOrEqualTo(String value) {
            addCriterion("dispaly_title >=", value, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleLessThan(String value) {
            addCriterion("dispaly_title <", value, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleLessThanOrEqualTo(String value) {
            addCriterion("dispaly_title <=", value, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleLike(String value) {
            addCriterion("dispaly_title like", value, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleNotLike(String value) {
            addCriterion("dispaly_title not like", value, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleIn(List<String> values) {
            addCriterion("dispaly_title in", values, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleNotIn(List<String> values) {
            addCriterion("dispaly_title not in", values, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleBetween(String value1, String value2) {
            addCriterion("dispaly_title between", value1, value2, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andDispalyTitleNotBetween(String value1, String value2) {
            addCriterion("dispaly_title not between", value1, value2, "dispalyTitle");
            return (Criteria) this;
        }

        public Criteria andFavCountIsNull() {
            addCriterion("fav_count is null");
            return (Criteria) this;
        }

        public Criteria andFavCountIsNotNull() {
            addCriterion("fav_count is not null");
            return (Criteria) this;
        }

        public Criteria andFavCountEqualTo(Integer value) {
            addCriterion("fav_count =", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountNotEqualTo(Integer value) {
            addCriterion("fav_count <>", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountGreaterThan(Integer value) {
            addCriterion("fav_count >", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fav_count >=", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountLessThan(Integer value) {
            addCriterion("fav_count <", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountLessThanOrEqualTo(Integer value) {
            addCriterion("fav_count <=", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountIn(List<Integer> values) {
            addCriterion("fav_count in", values, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountNotIn(List<Integer> values) {
            addCriterion("fav_count not in", values, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountBetween(Integer value1, Integer value2) {
            addCriterion("fav_count between", value1, value2, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fav_count not between", value1, value2, "favCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNull() {
            addCriterion("read_count is null");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNotNull() {
            addCriterion("read_count is not null");
            return (Criteria) this;
        }

        public Criteria andReadCountEqualTo(Integer value) {
            addCriterion("read_count =", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotEqualTo(Integer value) {
            addCriterion("read_count <>", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThan(Integer value) {
            addCriterion("read_count >", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_count >=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThan(Integer value) {
            addCriterion("read_count <", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("read_count <=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIn(List<Integer> values) {
            addCriterion("read_count in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotIn(List<Integer> values) {
            addCriterion("read_count not in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountBetween(Integer value1, Integer value2) {
            addCriterion("read_count between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("read_count not between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteIsNull() {
            addCriterion("is_goods_note is null");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteIsNotNull() {
            addCriterion("is_goods_note is not null");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteEqualTo(Byte value) {
            addCriterion("is_goods_note =", value, "isGoodsNote");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteNotEqualTo(Byte value) {
            addCriterion("is_goods_note <>", value, "isGoodsNote");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteGreaterThan(Byte value) {
            addCriterion("is_goods_note >", value, "isGoodsNote");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_goods_note >=", value, "isGoodsNote");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteLessThan(Byte value) {
            addCriterion("is_goods_note <", value, "isGoodsNote");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteLessThanOrEqualTo(Byte value) {
            addCriterion("is_goods_note <=", value, "isGoodsNote");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteIn(List<Byte> values) {
            addCriterion("is_goods_note in", values, "isGoodsNote");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteNotIn(List<Byte> values) {
            addCriterion("is_goods_note not in", values, "isGoodsNote");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteBetween(Byte value1, Byte value2) {
            addCriterion("is_goods_note between", value1, value2, "isGoodsNote");
            return (Criteria) this;
        }

        public Criteria andIsGoodsNoteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_goods_note not between", value1, value2, "isGoodsNote");
            return (Criteria) this;
        }

        public Criteria andModelTypeIsNull() {
            addCriterion("model_type is null");
            return (Criteria) this;
        }

        public Criteria andModelTypeIsNotNull() {
            addCriterion("model_type is not null");
            return (Criteria) this;
        }

        public Criteria andModelTypeEqualTo(String value) {
            addCriterion("model_type =", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeNotEqualTo(String value) {
            addCriterion("model_type <>", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeGreaterThan(String value) {
            addCriterion("model_type >", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("model_type >=", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeLessThan(String value) {
            addCriterion("model_type <", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeLessThanOrEqualTo(String value) {
            addCriterion("model_type <=", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeLike(String value) {
            addCriterion("model_type like", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeNotLike(String value) {
            addCriterion("model_type not like", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeIn(List<String> values) {
            addCriterion("model_type in", values, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeNotIn(List<String> values) {
            addCriterion("model_type not in", values, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeBetween(String value1, String value2) {
            addCriterion("model_type between", value1, value2, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeNotBetween(String value1, String value2) {
            addCriterion("model_type not between", value1, value2, "modelType");
            return (Criteria) this;
        }

        public Criteria andCursorScoreIsNull() {
            addCriterion("cursor_score is null");
            return (Criteria) this;
        }

        public Criteria andCursorScoreIsNotNull() {
            addCriterion("cursor_score is not null");
            return (Criteria) this;
        }

        public Criteria andCursorScoreEqualTo(Double value) {
            addCriterion("cursor_score =", value, "cursorScore");
            return (Criteria) this;
        }

        public Criteria andCursorScoreNotEqualTo(Double value) {
            addCriterion("cursor_score <>", value, "cursorScore");
            return (Criteria) this;
        }

        public Criteria andCursorScoreGreaterThan(Double value) {
            addCriterion("cursor_score >", value, "cursorScore");
            return (Criteria) this;
        }

        public Criteria andCursorScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("cursor_score >=", value, "cursorScore");
            return (Criteria) this;
        }

        public Criteria andCursorScoreLessThan(Double value) {
            addCriterion("cursor_score <", value, "cursorScore");
            return (Criteria) this;
        }

        public Criteria andCursorScoreLessThanOrEqualTo(Double value) {
            addCriterion("cursor_score <=", value, "cursorScore");
            return (Criteria) this;
        }

        public Criteria andCursorScoreIn(List<Double> values) {
            addCriterion("cursor_score in", values, "cursorScore");
            return (Criteria) this;
        }

        public Criteria andCursorScoreNotIn(List<Double> values) {
            addCriterion("cursor_score not in", values, "cursorScore");
            return (Criteria) this;
        }

        public Criteria andCursorScoreBetween(Double value1, Double value2) {
            addCriterion("cursor_score between", value1, value2, "cursorScore");
            return (Criteria) this;
        }

        public Criteria andCursorScoreNotBetween(Double value1, Double value2) {
            addCriterion("cursor_score not between", value1, value2, "cursorScore");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
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