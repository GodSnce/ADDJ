package com.qc.ssm.po.share;

import java.util.ArrayList;
import java.util.List;

public class ShareDataVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShareDataVideoExample() {
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

        public Criteria andPlayedCountIsNull() {
            addCriterion("played_count is null");
            return (Criteria) this;
        }

        public Criteria andPlayedCountIsNotNull() {
            addCriterion("played_count is not null");
            return (Criteria) this;
        }

        public Criteria andPlayedCountEqualTo(Integer value) {
            addCriterion("played_count =", value, "playedCount");
            return (Criteria) this;
        }

        public Criteria andPlayedCountNotEqualTo(Integer value) {
            addCriterion("played_count <>", value, "playedCount");
            return (Criteria) this;
        }

        public Criteria andPlayedCountGreaterThan(Integer value) {
            addCriterion("played_count >", value, "playedCount");
            return (Criteria) this;
        }

        public Criteria andPlayedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("played_count >=", value, "playedCount");
            return (Criteria) this;
        }

        public Criteria andPlayedCountLessThan(Integer value) {
            addCriterion("played_count <", value, "playedCount");
            return (Criteria) this;
        }

        public Criteria andPlayedCountLessThanOrEqualTo(Integer value) {
            addCriterion("played_count <=", value, "playedCount");
            return (Criteria) this;
        }

        public Criteria andPlayedCountIn(List<Integer> values) {
            addCriterion("played_count in", values, "playedCount");
            return (Criteria) this;
        }

        public Criteria andPlayedCountNotIn(List<Integer> values) {
            addCriterion("played_count not in", values, "playedCount");
            return (Criteria) this;
        }

        public Criteria andPlayedCountBetween(Integer value1, Integer value2) {
            addCriterion("played_count between", value1, value2, "playedCount");
            return (Criteria) this;
        }

        public Criteria andPlayedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("played_count not between", value1, value2, "playedCount");
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

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Integer> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andGifUrlIsNull() {
            addCriterion("gif_url is null");
            return (Criteria) this;
        }

        public Criteria andGifUrlIsNotNull() {
            addCriterion("gif_url is not null");
            return (Criteria) this;
        }

        public Criteria andGifUrlEqualTo(String value) {
            addCriterion("gif_url =", value, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andGifUrlNotEqualTo(String value) {
            addCriterion("gif_url <>", value, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andGifUrlGreaterThan(String value) {
            addCriterion("gif_url >", value, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andGifUrlGreaterThanOrEqualTo(String value) {
            addCriterion("gif_url >=", value, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andGifUrlLessThan(String value) {
            addCriterion("gif_url <", value, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andGifUrlLessThanOrEqualTo(String value) {
            addCriterion("gif_url <=", value, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andGifUrlLike(String value) {
            addCriterion("gif_url like", value, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andGifUrlNotLike(String value) {
            addCriterion("gif_url not like", value, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andGifUrlIn(List<String> values) {
            addCriterion("gif_url in", values, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andGifUrlNotIn(List<String> values) {
            addCriterion("gif_url not in", values, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andGifUrlBetween(String value1, String value2) {
            addCriterion("gif_url between", value1, value2, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andGifUrlNotBetween(String value1, String value2) {
            addCriterion("gif_url not between", value1, value2, "gifUrl");
            return (Criteria) this;
        }

        public Criteria andShareDataIdIsNull() {
            addCriterion("share_data_id is null");
            return (Criteria) this;
        }

        public Criteria andShareDataIdIsNotNull() {
            addCriterion("share_data_id is not null");
            return (Criteria) this;
        }

        public Criteria andShareDataIdEqualTo(String value) {
            addCriterion("share_data_id =", value, "shareDataId");
            return (Criteria) this;
        }

        public Criteria andShareDataIdNotEqualTo(String value) {
            addCriterion("share_data_id <>", value, "shareDataId");
            return (Criteria) this;
        }

        public Criteria andShareDataIdGreaterThan(String value) {
            addCriterion("share_data_id >", value, "shareDataId");
            return (Criteria) this;
        }

        public Criteria andShareDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("share_data_id >=", value, "shareDataId");
            return (Criteria) this;
        }

        public Criteria andShareDataIdLessThan(String value) {
            addCriterion("share_data_id <", value, "shareDataId");
            return (Criteria) this;
        }

        public Criteria andShareDataIdLessThanOrEqualTo(String value) {
            addCriterion("share_data_id <=", value, "shareDataId");
            return (Criteria) this;
        }

        public Criteria andShareDataIdLike(String value) {
            addCriterion("share_data_id like", value, "shareDataId");
            return (Criteria) this;
        }

        public Criteria andShareDataIdNotLike(String value) {
            addCriterion("share_data_id not like", value, "shareDataId");
            return (Criteria) this;
        }

        public Criteria andShareDataIdIn(List<String> values) {
            addCriterion("share_data_id in", values, "shareDataId");
            return (Criteria) this;
        }

        public Criteria andShareDataIdNotIn(List<String> values) {
            addCriterion("share_data_id not in", values, "shareDataId");
            return (Criteria) this;
        }

        public Criteria andShareDataIdBetween(String value1, String value2) {
            addCriterion("share_data_id between", value1, value2, "shareDataId");
            return (Criteria) this;
        }

        public Criteria andShareDataIdNotBetween(String value1, String value2) {
            addCriterion("share_data_id not between", value1, value2, "shareDataId");
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