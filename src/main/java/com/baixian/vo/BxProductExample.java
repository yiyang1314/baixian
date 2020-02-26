package com.baixian.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BxProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BxProductExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductAttrIsNull() {
            addCriterion("product_attr is null");
            return (Criteria) this;
        }

        public Criteria andProductAttrIsNotNull() {
            addCriterion("product_attr is not null");
            return (Criteria) this;
        }

        public Criteria andProductAttrEqualTo(String value) {
            addCriterion("product_attr =", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrNotEqualTo(String value) {
            addCriterion("product_attr <>", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrGreaterThan(String value) {
            addCriterion("product_attr >", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrGreaterThanOrEqualTo(String value) {
            addCriterion("product_attr >=", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrLessThan(String value) {
            addCriterion("product_attr <", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrLessThanOrEqualTo(String value) {
            addCriterion("product_attr <=", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrLike(String value) {
            addCriterion("product_attr like", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrNotLike(String value) {
            addCriterion("product_attr not like", value, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrIn(List<String> values) {
            addCriterion("product_attr in", values, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrNotIn(List<String> values) {
            addCriterion("product_attr not in", values, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrBetween(String value1, String value2) {
            addCriterion("product_attr between", value1, value2, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductAttrNotBetween(String value1, String value2) {
            addCriterion("product_attr not between", value1, value2, "productAttr");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalIsNull() {
            addCriterion("product_specical is null");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalIsNotNull() {
            addCriterion("product_specical is not null");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalEqualTo(String value) {
            addCriterion("product_specical =", value, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalNotEqualTo(String value) {
            addCriterion("product_specical <>", value, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalGreaterThan(String value) {
            addCriterion("product_specical >", value, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalGreaterThanOrEqualTo(String value) {
            addCriterion("product_specical >=", value, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalLessThan(String value) {
            addCriterion("product_specical <", value, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalLessThanOrEqualTo(String value) {
            addCriterion("product_specical <=", value, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalLike(String value) {
            addCriterion("product_specical like", value, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalNotLike(String value) {
            addCriterion("product_specical not like", value, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalIn(List<String> values) {
            addCriterion("product_specical in", values, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalNotIn(List<String> values) {
            addCriterion("product_specical not in", values, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalBetween(String value1, String value2) {
            addCriterion("product_specical between", value1, value2, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andProductSpecicalNotBetween(String value1, String value2) {
            addCriterion("product_specical not between", value1, value2, "productSpecical");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andSendCityIsNull() {
            addCriterion("send_city is null");
            return (Criteria) this;
        }

        public Criteria andSendCityIsNotNull() {
            addCriterion("send_city is not null");
            return (Criteria) this;
        }

        public Criteria andSendCityEqualTo(String value) {
            addCriterion("send_city =", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotEqualTo(String value) {
            addCriterion("send_city <>", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityGreaterThan(String value) {
            addCriterion("send_city >", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityGreaterThanOrEqualTo(String value) {
            addCriterion("send_city >=", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLessThan(String value) {
            addCriterion("send_city <", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLessThanOrEqualTo(String value) {
            addCriterion("send_city <=", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityLike(String value) {
            addCriterion("send_city like", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotLike(String value) {
            addCriterion("send_city not like", value, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityIn(List<String> values) {
            addCriterion("send_city in", values, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotIn(List<String> values) {
            addCriterion("send_city not in", values, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityBetween(String value1, String value2) {
            addCriterion("send_city between", value1, value2, "sendCity");
            return (Criteria) this;
        }

        public Criteria andSendCityNotBetween(String value1, String value2) {
            addCriterion("send_city not between", value1, value2, "sendCity");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNull() {
            addCriterion("comm_id is null");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNotNull() {
            addCriterion("comm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommIdEqualTo(Integer value) {
            addCriterion("comm_id =", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotEqualTo(Integer value) {
            addCriterion("comm_id <>", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThan(Integer value) {
            addCriterion("comm_id >", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_id >=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThan(Integer value) {
            addCriterion("comm_id <", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThanOrEqualTo(Integer value) {
            addCriterion("comm_id <=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdIn(List<Integer> values) {
            addCriterion("comm_id in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotIn(List<Integer> values) {
            addCriterion("comm_id not in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdBetween(Integer value1, Integer value2) {
            addCriterion("comm_id between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_id not between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Integer value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Integer value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Integer value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Integer value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Integer> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Integer> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Integer value1, Integer value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsIsNull() {
            addCriterion("exists_goods is null");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsIsNotNull() {
            addCriterion("exists_goods is not null");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsEqualTo(Integer value) {
            addCriterion("exists_goods =", value, "existsGoods");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsNotEqualTo(Integer value) {
            addCriterion("exists_goods <>", value, "existsGoods");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsGreaterThan(Integer value) {
            addCriterion("exists_goods >", value, "existsGoods");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("exists_goods >=", value, "existsGoods");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsLessThan(Integer value) {
            addCriterion("exists_goods <", value, "existsGoods");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("exists_goods <=", value, "existsGoods");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsIn(List<Integer> values) {
            addCriterion("exists_goods in", values, "existsGoods");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsNotIn(List<Integer> values) {
            addCriterion("exists_goods not in", values, "existsGoods");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsBetween(Integer value1, Integer value2) {
            addCriterion("exists_goods between", value1, value2, "existsGoods");
            return (Criteria) this;
        }

        public Criteria andExistsGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("exists_goods not between", value1, value2, "existsGoods");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadIsNull() {
            addCriterion("repository_nead is null");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadIsNotNull() {
            addCriterion("repository_nead is not null");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadEqualTo(String value) {
            addCriterion("repository_nead =", value, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadNotEqualTo(String value) {
            addCriterion("repository_nead <>", value, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadGreaterThan(String value) {
            addCriterion("repository_nead >", value, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadGreaterThanOrEqualTo(String value) {
            addCriterion("repository_nead >=", value, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadLessThan(String value) {
            addCriterion("repository_nead <", value, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadLessThanOrEqualTo(String value) {
            addCriterion("repository_nead <=", value, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadLike(String value) {
            addCriterion("repository_nead like", value, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadNotLike(String value) {
            addCriterion("repository_nead not like", value, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadIn(List<String> values) {
            addCriterion("repository_nead in", values, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadNotIn(List<String> values) {
            addCriterion("repository_nead not in", values, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadBetween(String value1, String value2) {
            addCriterion("repository_nead between", value1, value2, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andRepositoryNeadNotBetween(String value1, String value2) {
            addCriterion("repository_nead not between", value1, value2, "repositoryNead");
            return (Criteria) this;
        }

        public Criteria andItemcatIdIsNull() {
            addCriterion("itemcat_id is null");
            return (Criteria) this;
        }

        public Criteria andItemcatIdIsNotNull() {
            addCriterion("itemcat_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemcatIdEqualTo(Integer value) {
            addCriterion("itemcat_id =", value, "itemcatId");
            return (Criteria) this;
        }

        public Criteria andItemcatIdNotEqualTo(Integer value) {
            addCriterion("itemcat_id <>", value, "itemcatId");
            return (Criteria) this;
        }

        public Criteria andItemcatIdGreaterThan(Integer value) {
            addCriterion("itemcat_id >", value, "itemcatId");
            return (Criteria) this;
        }

        public Criteria andItemcatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemcat_id >=", value, "itemcatId");
            return (Criteria) this;
        }

        public Criteria andItemcatIdLessThan(Integer value) {
            addCriterion("itemcat_id <", value, "itemcatId");
            return (Criteria) this;
        }

        public Criteria andItemcatIdLessThanOrEqualTo(Integer value) {
            addCriterion("itemcat_id <=", value, "itemcatId");
            return (Criteria) this;
        }

        public Criteria andItemcatIdIn(List<Integer> values) {
            addCriterion("itemcat_id in", values, "itemcatId");
            return (Criteria) this;
        }

        public Criteria andItemcatIdNotIn(List<Integer> values) {
            addCriterion("itemcat_id not in", values, "itemcatId");
            return (Criteria) this;
        }

        public Criteria andItemcatIdBetween(Integer value1, Integer value2) {
            addCriterion("itemcat_id between", value1, value2, "itemcatId");
            return (Criteria) this;
        }

        public Criteria andItemcatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("itemcat_id not between", value1, value2, "itemcatId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterionForJDBCDate("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterionForJDBCDate("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andImageListIsNull() {
            addCriterion("image_list is null");
            return (Criteria) this;
        }

        public Criteria andImageListIsNotNull() {
            addCriterion("image_list is not null");
            return (Criteria) this;
        }

        public Criteria andImageListEqualTo(String value) {
            addCriterion("image_list =", value, "imageList");
            return (Criteria) this;
        }

        public Criteria andImageListNotEqualTo(String value) {
            addCriterion("image_list <>", value, "imageList");
            return (Criteria) this;
        }

        public Criteria andImageListGreaterThan(String value) {
            addCriterion("image_list >", value, "imageList");
            return (Criteria) this;
        }

        public Criteria andImageListGreaterThanOrEqualTo(String value) {
            addCriterion("image_list >=", value, "imageList");
            return (Criteria) this;
        }

        public Criteria andImageListLessThan(String value) {
            addCriterion("image_list <", value, "imageList");
            return (Criteria) this;
        }

        public Criteria andImageListLessThanOrEqualTo(String value) {
            addCriterion("image_list <=", value, "imageList");
            return (Criteria) this;
        }

        public Criteria andImageListLike(String value) {
            addCriterion("image_list like", value, "imageList");
            return (Criteria) this;
        }

        public Criteria andImageListNotLike(String value) {
            addCriterion("image_list not like", value, "imageList");
            return (Criteria) this;
        }

        public Criteria andImageListIn(List<String> values) {
            addCriterion("image_list in", values, "imageList");
            return (Criteria) this;
        }

        public Criteria andImageListNotIn(List<String> values) {
            addCriterion("image_list not in", values, "imageList");
            return (Criteria) this;
        }

        public Criteria andImageListBetween(String value1, String value2) {
            addCriterion("image_list between", value1, value2, "imageList");
            return (Criteria) this;
        }

        public Criteria andImageListNotBetween(String value1, String value2) {
            addCriterion("image_list not between", value1, value2, "imageList");
            return (Criteria) this;
        }

        public Criteria andBandIdIsNull() {
            addCriterion("band_id is null");
            return (Criteria) this;
        }

        public Criteria andBandIdIsNotNull() {
            addCriterion("band_id is not null");
            return (Criteria) this;
        }

        public Criteria andBandIdEqualTo(Integer value) {
            addCriterion("band_id =", value, "bandId");
            return (Criteria) this;
        }

        public Criteria andBandIdNotEqualTo(Integer value) {
            addCriterion("band_id <>", value, "bandId");
            return (Criteria) this;
        }

        public Criteria andBandIdGreaterThan(Integer value) {
            addCriterion("band_id >", value, "bandId");
            return (Criteria) this;
        }

        public Criteria andBandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("band_id >=", value, "bandId");
            return (Criteria) this;
        }

        public Criteria andBandIdLessThan(Integer value) {
            addCriterion("band_id <", value, "bandId");
            return (Criteria) this;
        }

        public Criteria andBandIdLessThanOrEqualTo(Integer value) {
            addCriterion("band_id <=", value, "bandId");
            return (Criteria) this;
        }

        public Criteria andBandIdIn(List<Integer> values) {
            addCriterion("band_id in", values, "bandId");
            return (Criteria) this;
        }

        public Criteria andBandIdNotIn(List<Integer> values) {
            addCriterion("band_id not in", values, "bandId");
            return (Criteria) this;
        }

        public Criteria andBandIdBetween(Integer value1, Integer value2) {
            addCriterion("band_id between", value1, value2, "bandId");
            return (Criteria) this;
        }

        public Criteria andBandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("band_id not between", value1, value2, "bandId");
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