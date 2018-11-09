package com.qc.ssm.po.wx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XyxSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XyxSummaryExample() {
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

        public Criteria andFenleiIsNull() {
            addCriterion("fenlei is null");
            return (Criteria) this;
        }

        public Criteria andFenleiIsNotNull() {
            addCriterion("fenlei is not null");
            return (Criteria) this;
        }

        public Criteria andFenleiEqualTo(String value) {
            addCriterion("fenlei =", value, "fenlei");
            return (Criteria) this;
        }

        public Criteria andFenleiNotEqualTo(String value) {
            addCriterion("fenlei <>", value, "fenlei");
            return (Criteria) this;
        }

        public Criteria andFenleiGreaterThan(String value) {
            addCriterion("fenlei >", value, "fenlei");
            return (Criteria) this;
        }

        public Criteria andFenleiGreaterThanOrEqualTo(String value) {
            addCriterion("fenlei >=", value, "fenlei");
            return (Criteria) this;
        }

        public Criteria andFenleiLessThan(String value) {
            addCriterion("fenlei <", value, "fenlei");
            return (Criteria) this;
        }

        public Criteria andFenleiLessThanOrEqualTo(String value) {
            addCriterion("fenlei <=", value, "fenlei");
            return (Criteria) this;
        }

        public Criteria andFenleiLike(String value) {
            addCriterion("fenlei like", value, "fenlei");
            return (Criteria) this;
        }

        public Criteria andFenleiNotLike(String value) {
            addCriterion("fenlei not like", value, "fenlei");
            return (Criteria) this;
        }

        public Criteria andFenleiIn(List<String> values) {
            addCriterion("fenlei in", values, "fenlei");
            return (Criteria) this;
        }

        public Criteria andFenleiNotIn(List<String> values) {
            addCriterion("fenlei not in", values, "fenlei");
            return (Criteria) this;
        }

        public Criteria andFenleiBetween(String value1, String value2) {
            addCriterion("fenlei between", value1, value2, "fenlei");
            return (Criteria) this;
        }

        public Criteria andFenleiNotBetween(String value1, String value2) {
            addCriterion("fenlei not between", value1, value2, "fenlei");
            return (Criteria) this;
        }

        public Criteria andIconimgIsNull() {
            addCriterion("iconimg is null");
            return (Criteria) this;
        }

        public Criteria andIconimgIsNotNull() {
            addCriterion("iconimg is not null");
            return (Criteria) this;
        }

        public Criteria andIconimgEqualTo(String value) {
            addCriterion("iconimg =", value, "iconimg");
            return (Criteria) this;
        }

        public Criteria andIconimgNotEqualTo(String value) {
            addCriterion("iconimg <>", value, "iconimg");
            return (Criteria) this;
        }

        public Criteria andIconimgGreaterThan(String value) {
            addCriterion("iconimg >", value, "iconimg");
            return (Criteria) this;
        }

        public Criteria andIconimgGreaterThanOrEqualTo(String value) {
            addCriterion("iconimg >=", value, "iconimg");
            return (Criteria) this;
        }

        public Criteria andIconimgLessThan(String value) {
            addCriterion("iconimg <", value, "iconimg");
            return (Criteria) this;
        }

        public Criteria andIconimgLessThanOrEqualTo(String value) {
            addCriterion("iconimg <=", value, "iconimg");
            return (Criteria) this;
        }

        public Criteria andIconimgLike(String value) {
            addCriterion("iconimg like", value, "iconimg");
            return (Criteria) this;
        }

        public Criteria andIconimgNotLike(String value) {
            addCriterion("iconimg not like", value, "iconimg");
            return (Criteria) this;
        }

        public Criteria andIconimgIn(List<String> values) {
            addCriterion("iconimg in", values, "iconimg");
            return (Criteria) this;
        }

        public Criteria andIconimgNotIn(List<String> values) {
            addCriterion("iconimg not in", values, "iconimg");
            return (Criteria) this;
        }

        public Criteria andIconimgBetween(String value1, String value2) {
            addCriterion("iconimg between", value1, value2, "iconimg");
            return (Criteria) this;
        }

        public Criteria andIconimgNotBetween(String value1, String value2) {
            addCriterion("iconimg not between", value1, value2, "iconimg");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andPaixuIsNull() {
            addCriterion("paixu is null");
            return (Criteria) this;
        }

        public Criteria andPaixuIsNotNull() {
            addCriterion("paixu is not null");
            return (Criteria) this;
        }

        public Criteria andPaixuEqualTo(Integer value) {
            addCriterion("paixu =", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotEqualTo(Integer value) {
            addCriterion("paixu <>", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuGreaterThan(Integer value) {
            addCriterion("paixu >", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuGreaterThanOrEqualTo(Integer value) {
            addCriterion("paixu >=", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuLessThan(Integer value) {
            addCriterion("paixu <", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuLessThanOrEqualTo(Integer value) {
            addCriterion("paixu <=", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuIn(List<Integer> values) {
            addCriterion("paixu in", values, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotIn(List<Integer> values) {
            addCriterion("paixu not in", values, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuBetween(Integer value1, Integer value2) {
            addCriterion("paixu between", value1, value2, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotBetween(Integer value1, Integer value2) {
            addCriterion("paixu not between", value1, value2, "paixu");
            return (Criteria) this;
        }

        public Criteria andQrcodeIsNull() {
            addCriterion("qrcode is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeIsNotNull() {
            addCriterion("qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeEqualTo(String value) {
            addCriterion("qrcode =", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotEqualTo(String value) {
            addCriterion("qrcode <>", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeGreaterThan(String value) {
            addCriterion("qrcode >", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode >=", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLessThan(String value) {
            addCriterion("qrcode <", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLessThanOrEqualTo(String value) {
            addCriterion("qrcode <=", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLike(String value) {
            addCriterion("qrcode like", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotLike(String value) {
            addCriterion("qrcode not like", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeIn(List<String> values) {
            addCriterion("qrcode in", values, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotIn(List<String> values) {
            addCriterion("qrcode not in", values, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeBetween(String value1, String value2) {
            addCriterion("qrcode between", value1, value2, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotBetween(String value1, String value2) {
            addCriterion("qrcode not between", value1, value2, "qrcode");
            return (Criteria) this;
        }

        public Criteria andJianjieIsNull() {
            addCriterion("jianjie is null");
            return (Criteria) this;
        }

        public Criteria andJianjieIsNotNull() {
            addCriterion("jianjie is not null");
            return (Criteria) this;
        }

        public Criteria andJianjieEqualTo(String value) {
            addCriterion("jianjie =", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotEqualTo(String value) {
            addCriterion("jianjie <>", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieGreaterThan(String value) {
            addCriterion("jianjie >", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieGreaterThanOrEqualTo(String value) {
            addCriterion("jianjie >=", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLessThan(String value) {
            addCriterion("jianjie <", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLessThanOrEqualTo(String value) {
            addCriterion("jianjie <=", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLike(String value) {
            addCriterion("jianjie like", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotLike(String value) {
            addCriterion("jianjie not like", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieIn(List<String> values) {
            addCriterion("jianjie in", values, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotIn(List<String> values) {
            addCriterion("jianjie not in", values, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieBetween(String value1, String value2) {
            addCriterion("jianjie between", value1, value2, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotBetween(String value1, String value2) {
            addCriterion("jianjie not between", value1, value2, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJietuIsNull() {
            addCriterion("jietu is null");
            return (Criteria) this;
        }

        public Criteria andJietuIsNotNull() {
            addCriterion("jietu is not null");
            return (Criteria) this;
        }

        public Criteria andJietuEqualTo(String value) {
            addCriterion("jietu =", value, "jietu");
            return (Criteria) this;
        }

        public Criteria andJietuNotEqualTo(String value) {
            addCriterion("jietu <>", value, "jietu");
            return (Criteria) this;
        }

        public Criteria andJietuGreaterThan(String value) {
            addCriterion("jietu >", value, "jietu");
            return (Criteria) this;
        }

        public Criteria andJietuGreaterThanOrEqualTo(String value) {
            addCriterion("jietu >=", value, "jietu");
            return (Criteria) this;
        }

        public Criteria andJietuLessThan(String value) {
            addCriterion("jietu <", value, "jietu");
            return (Criteria) this;
        }

        public Criteria andJietuLessThanOrEqualTo(String value) {
            addCriterion("jietu <=", value, "jietu");
            return (Criteria) this;
        }

        public Criteria andJietuLike(String value) {
            addCriterion("jietu like", value, "jietu");
            return (Criteria) this;
        }

        public Criteria andJietuNotLike(String value) {
            addCriterion("jietu not like", value, "jietu");
            return (Criteria) this;
        }

        public Criteria andJietuIn(List<String> values) {
            addCriterion("jietu in", values, "jietu");
            return (Criteria) this;
        }

        public Criteria andJietuNotIn(List<String> values) {
            addCriterion("jietu not in", values, "jietu");
            return (Criteria) this;
        }

        public Criteria andJietuBetween(String value1, String value2) {
            addCriterion("jietu between", value1, value2, "jietu");
            return (Criteria) this;
        }

        public Criteria andJietuNotBetween(String value1, String value2) {
            addCriterion("jietu not between", value1, value2, "jietu");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("ext3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("ext3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("ext3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("ext3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ext3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("ext3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("ext3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("ext3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("ext3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("ext3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("ext3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("ext3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("ext3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt4IsNull() {
            addCriterion("ext4 is null");
            return (Criteria) this;
        }

        public Criteria andExt4IsNotNull() {
            addCriterion("ext4 is not null");
            return (Criteria) this;
        }

        public Criteria andExt4EqualTo(String value) {
            addCriterion("ext4 =", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotEqualTo(String value) {
            addCriterion("ext4 <>", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThan(String value) {
            addCriterion("ext4 >", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThanOrEqualTo(String value) {
            addCriterion("ext4 >=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThan(String value) {
            addCriterion("ext4 <", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThanOrEqualTo(String value) {
            addCriterion("ext4 <=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Like(String value) {
            addCriterion("ext4 like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotLike(String value) {
            addCriterion("ext4 not like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4In(List<String> values) {
            addCriterion("ext4 in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotIn(List<String> values) {
            addCriterion("ext4 not in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Between(String value1, String value2) {
            addCriterion("ext4 between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotBetween(String value1, String value2) {
            addCriterion("ext4 not between", value1, value2, "ext4");
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