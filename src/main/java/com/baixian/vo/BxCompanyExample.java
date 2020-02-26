package com.baixian.vo;

import java.util.ArrayList;
import java.util.List;

public class BxCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BxCompanyExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
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

        public Criteria andOtherListIsNull() {
            addCriterion("other_list is null");
            return (Criteria) this;
        }

        public Criteria andOtherListIsNotNull() {
            addCriterion("other_list is not null");
            return (Criteria) this;
        }

        public Criteria andOtherListEqualTo(String value) {
            addCriterion("other_list =", value, "otherList");
            return (Criteria) this;
        }

        public Criteria andOtherListNotEqualTo(String value) {
            addCriterion("other_list <>", value, "otherList");
            return (Criteria) this;
        }

        public Criteria andOtherListGreaterThan(String value) {
            addCriterion("other_list >", value, "otherList");
            return (Criteria) this;
        }

        public Criteria andOtherListGreaterThanOrEqualTo(String value) {
            addCriterion("other_list >=", value, "otherList");
            return (Criteria) this;
        }

        public Criteria andOtherListLessThan(String value) {
            addCriterion("other_list <", value, "otherList");
            return (Criteria) this;
        }

        public Criteria andOtherListLessThanOrEqualTo(String value) {
            addCriterion("other_list <=", value, "otherList");
            return (Criteria) this;
        }

        public Criteria andOtherListLike(String value) {
            addCriterion("other_list like", value, "otherList");
            return (Criteria) this;
        }

        public Criteria andOtherListNotLike(String value) {
            addCriterion("other_list not like", value, "otherList");
            return (Criteria) this;
        }

        public Criteria andOtherListIn(List<String> values) {
            addCriterion("other_list in", values, "otherList");
            return (Criteria) this;
        }

        public Criteria andOtherListNotIn(List<String> values) {
            addCriterion("other_list not in", values, "otherList");
            return (Criteria) this;
        }

        public Criteria andOtherListBetween(String value1, String value2) {
            addCriterion("other_list between", value1, value2, "otherList");
            return (Criteria) this;
        }

        public Criteria andOtherListNotBetween(String value1, String value2) {
            addCriterion("other_list not between", value1, value2, "otherList");
            return (Criteria) this;
        }

        public Criteria andCorporateIsNull() {
            addCriterion("corporate is null");
            return (Criteria) this;
        }

        public Criteria andCorporateIsNotNull() {
            addCriterion("corporate is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateEqualTo(String value) {
            addCriterion("corporate =", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateNotEqualTo(String value) {
            addCriterion("corporate <>", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateGreaterThan(String value) {
            addCriterion("corporate >", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateGreaterThanOrEqualTo(String value) {
            addCriterion("corporate >=", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateLessThan(String value) {
            addCriterion("corporate <", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateLessThanOrEqualTo(String value) {
            addCriterion("corporate <=", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateLike(String value) {
            addCriterion("corporate like", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateNotLike(String value) {
            addCriterion("corporate not like", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateIn(List<String> values) {
            addCriterion("corporate in", values, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateNotIn(List<String> values) {
            addCriterion("corporate not in", values, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateBetween(String value1, String value2) {
            addCriterion("corporate between", value1, value2, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateNotBetween(String value1, String value2) {
            addCriterion("corporate not between", value1, value2, "corporate");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperateServiceIsNull() {
            addCriterion("operate_service is null");
            return (Criteria) this;
        }

        public Criteria andOperateServiceIsNotNull() {
            addCriterion("operate_service is not null");
            return (Criteria) this;
        }

        public Criteria andOperateServiceEqualTo(String value) {
            addCriterion("operate_service =", value, "operateService");
            return (Criteria) this;
        }

        public Criteria andOperateServiceNotEqualTo(String value) {
            addCriterion("operate_service <>", value, "operateService");
            return (Criteria) this;
        }

        public Criteria andOperateServiceGreaterThan(String value) {
            addCriterion("operate_service >", value, "operateService");
            return (Criteria) this;
        }

        public Criteria andOperateServiceGreaterThanOrEqualTo(String value) {
            addCriterion("operate_service >=", value, "operateService");
            return (Criteria) this;
        }

        public Criteria andOperateServiceLessThan(String value) {
            addCriterion("operate_service <", value, "operateService");
            return (Criteria) this;
        }

        public Criteria andOperateServiceLessThanOrEqualTo(String value) {
            addCriterion("operate_service <=", value, "operateService");
            return (Criteria) this;
        }

        public Criteria andOperateServiceLike(String value) {
            addCriterion("operate_service like", value, "operateService");
            return (Criteria) this;
        }

        public Criteria andOperateServiceNotLike(String value) {
            addCriterion("operate_service not like", value, "operateService");
            return (Criteria) this;
        }

        public Criteria andOperateServiceIn(List<String> values) {
            addCriterion("operate_service in", values, "operateService");
            return (Criteria) this;
        }

        public Criteria andOperateServiceNotIn(List<String> values) {
            addCriterion("operate_service not in", values, "operateService");
            return (Criteria) this;
        }

        public Criteria andOperateServiceBetween(String value1, String value2) {
            addCriterion("operate_service between", value1, value2, "operateService");
            return (Criteria) this;
        }

        public Criteria andOperateServiceNotBetween(String value1, String value2) {
            addCriterion("operate_service not between", value1, value2, "operateService");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusIsNull() {
            addCriterion("authentic_status is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusIsNotNull() {
            addCriterion("authentic_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusEqualTo(Integer value) {
            addCriterion("authentic_status =", value, "authenticStatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusNotEqualTo(Integer value) {
            addCriterion("authentic_status <>", value, "authenticStatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusGreaterThan(Integer value) {
            addCriterion("authentic_status >", value, "authenticStatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("authentic_status >=", value, "authenticStatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusLessThan(Integer value) {
            addCriterion("authentic_status <", value, "authenticStatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusLessThanOrEqualTo(Integer value) {
            addCriterion("authentic_status <=", value, "authenticStatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusIn(List<Integer> values) {
            addCriterion("authentic_status in", values, "authenticStatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusNotIn(List<Integer> values) {
            addCriterion("authentic_status not in", values, "authenticStatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusBetween(Integer value1, Integer value2) {
            addCriterion("authentic_status between", value1, value2, "authenticStatus");
            return (Criteria) this;
        }

        public Criteria andAuthenticStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("authentic_status not between", value1, value2, "authenticStatus");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
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