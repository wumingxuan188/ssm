package com.mr.model;

import java.util.ArrayList;
import java.util.List;

public class ClsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClsExample() {
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

        public Criteria andClsIdIsNull() {
            addCriterion("cls_id is null");
            return (Criteria) this;
        }

        public Criteria andClsIdIsNotNull() {
            addCriterion("cls_id is not null");
            return (Criteria) this;
        }

        public Criteria andClsIdEqualTo(Integer value) {
            addCriterion("cls_id =", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotEqualTo(Integer value) {
            addCriterion("cls_id <>", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThan(Integer value) {
            addCriterion("cls_id >", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cls_id >=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThan(Integer value) {
            addCriterion("cls_id <", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThanOrEqualTo(Integer value) {
            addCriterion("cls_id <=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdIn(List<Integer> values) {
            addCriterion("cls_id in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotIn(List<Integer> values) {
            addCriterion("cls_id not in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdBetween(Integer value1, Integer value2) {
            addCriterion("cls_id between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cls_id not between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsNameIsNull() {
            addCriterion("cls_name is null");
            return (Criteria) this;
        }

        public Criteria andClsNameIsNotNull() {
            addCriterion("cls_name is not null");
            return (Criteria) this;
        }

        public Criteria andClsNameEqualTo(String value) {
            addCriterion("cls_name =", value, "clsName");
            return (Criteria) this;
        }

        public Criteria andClsNameNotEqualTo(String value) {
            addCriterion("cls_name <>", value, "clsName");
            return (Criteria) this;
        }

        public Criteria andClsNameGreaterThan(String value) {
            addCriterion("cls_name >", value, "clsName");
            return (Criteria) this;
        }

        public Criteria andClsNameGreaterThanOrEqualTo(String value) {
            addCriterion("cls_name >=", value, "clsName");
            return (Criteria) this;
        }

        public Criteria andClsNameLessThan(String value) {
            addCriterion("cls_name <", value, "clsName");
            return (Criteria) this;
        }

        public Criteria andClsNameLessThanOrEqualTo(String value) {
            addCriterion("cls_name <=", value, "clsName");
            return (Criteria) this;
        }

        public Criteria andClsNameLike(String value) {
            addCriterion("cls_name like", value, "clsName");
            return (Criteria) this;
        }

        public Criteria andClsNameNotLike(String value) {
            addCriterion("cls_name not like", value, "clsName");
            return (Criteria) this;
        }

        public Criteria andClsNameIn(List<String> values) {
            addCriterion("cls_name in", values, "clsName");
            return (Criteria) this;
        }

        public Criteria andClsNameNotIn(List<String> values) {
            addCriterion("cls_name not in", values, "clsName");
            return (Criteria) this;
        }

        public Criteria andClsNameBetween(String value1, String value2) {
            addCriterion("cls_name between", value1, value2, "clsName");
            return (Criteria) this;
        }

        public Criteria andClsNameNotBetween(String value1, String value2) {
            addCriterion("cls_name not between", value1, value2, "clsName");
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