package com.mr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginExample() {
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

        public Criteria andLoginIdIsNull() {
            addCriterion("login_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("login_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(Integer value) {
            addCriterion("login_id =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(Integer value) {
            addCriterion("login_id <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(Integer value) {
            addCriterion("login_id >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_id >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(Integer value) {
            addCriterion("login_id <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(Integer value) {
            addCriterion("login_id <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<Integer> values) {
            addCriterion("login_id in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<Integer> values) {
            addCriterion("login_id not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(Integer value1, Integer value2) {
            addCriterion("login_id between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(Integer value1, Integer value2) {
            addCriterion("login_id not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginPswIsNull() {
            addCriterion("login_psw is null");
            return (Criteria) this;
        }

        public Criteria andLoginPswIsNotNull() {
            addCriterion("login_psw is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPswEqualTo(String value) {
            addCriterion("login_psw =", value, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginPswNotEqualTo(String value) {
            addCriterion("login_psw <>", value, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginPswGreaterThan(String value) {
            addCriterion("login_psw >", value, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginPswGreaterThanOrEqualTo(String value) {
            addCriterion("login_psw >=", value, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginPswLessThan(String value) {
            addCriterion("login_psw <", value, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginPswLessThanOrEqualTo(String value) {
            addCriterion("login_psw <=", value, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginPswLike(String value) {
            addCriterion("login_psw like", value, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginPswNotLike(String value) {
            addCriterion("login_psw not like", value, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginPswIn(List<String> values) {
            addCriterion("login_psw in", values, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginPswNotIn(List<String> values) {
            addCriterion("login_psw not in", values, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginPswBetween(String value1, String value2) {
            addCriterion("login_psw between", value1, value2, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginPswNotBetween(String value1, String value2) {
            addCriterion("login_psw not between", value1, value2, "loginPsw");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumIsNull() {
            addCriterion("login_errnum is null");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumIsNotNull() {
            addCriterion("login_errnum is not null");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumEqualTo(Integer value) {
            addCriterion("login_errnum =", value, "loginErrnum");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumNotEqualTo(Integer value) {
            addCriterion("login_errnum <>", value, "loginErrnum");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumGreaterThan(Integer value) {
            addCriterion("login_errnum >", value, "loginErrnum");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_errnum >=", value, "loginErrnum");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumLessThan(Integer value) {
            addCriterion("login_errnum <", value, "loginErrnum");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumLessThanOrEqualTo(Integer value) {
            addCriterion("login_errnum <=", value, "loginErrnum");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumIn(List<Integer> values) {
            addCriterion("login_errnum in", values, "loginErrnum");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumNotIn(List<Integer> values) {
            addCriterion("login_errnum not in", values, "loginErrnum");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumBetween(Integer value1, Integer value2) {
            addCriterion("login_errnum between", value1, value2, "loginErrnum");
            return (Criteria) this;
        }

        public Criteria andLoginErrnumNotBetween(Integer value1, Integer value2) {
            addCriterion("login_errnum not between", value1, value2, "loginErrnum");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterionForJDBCDate("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeIsNull() {
            addCriterion("login_coldTime is null");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeIsNotNull() {
            addCriterion("login_coldTime is not null");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeEqualTo(Date value) {
            addCriterionForJDBCDate("login_coldTime =", value, "loginColdtime");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("login_coldTime <>", value, "loginColdtime");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("login_coldTime >", value, "loginColdtime");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("login_coldTime >=", value, "loginColdtime");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeLessThan(Date value) {
            addCriterionForJDBCDate("login_coldTime <", value, "loginColdtime");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("login_coldTime <=", value, "loginColdtime");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeIn(List<Date> values) {
            addCriterionForJDBCDate("login_coldTime in", values, "loginColdtime");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("login_coldTime not in", values, "loginColdtime");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("login_coldTime between", value1, value2, "loginColdtime");
            return (Criteria) this;
        }

        public Criteria andLoginColdtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("login_coldTime not between", value1, value2, "loginColdtime");
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