package com.mr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(Integer value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(Integer value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(Integer value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(Integer value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(Integer value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<Integer> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<Integer> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(Integer value1, Integer value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuHobbyIsNull() {
            addCriterion("stu_hobby is null");
            return (Criteria) this;
        }

        public Criteria andStuHobbyIsNotNull() {
            addCriterion("stu_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andStuHobbyEqualTo(String value) {
            addCriterion("stu_hobby =", value, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuHobbyNotEqualTo(String value) {
            addCriterion("stu_hobby <>", value, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuHobbyGreaterThan(String value) {
            addCriterion("stu_hobby >", value, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("stu_hobby >=", value, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuHobbyLessThan(String value) {
            addCriterion("stu_hobby <", value, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuHobbyLessThanOrEqualTo(String value) {
            addCriterion("stu_hobby <=", value, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuHobbyLike(String value) {
            addCriterion("stu_hobby like", value, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuHobbyNotLike(String value) {
            addCriterion("stu_hobby not like", value, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuHobbyIn(List<String> values) {
            addCriterion("stu_hobby in", values, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuHobbyNotIn(List<String> values) {
            addCriterion("stu_hobby not in", values, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuHobbyBetween(String value1, String value2) {
            addCriterion("stu_hobby between", value1, value2, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuHobbyNotBetween(String value1, String value2) {
            addCriterion("stu_hobby not between", value1, value2, "stuHobby");
            return (Criteria) this;
        }

        public Criteria andStuImgIsNull() {
            addCriterion("stu_img is null");
            return (Criteria) this;
        }

        public Criteria andStuImgIsNotNull() {
            addCriterion("stu_img is not null");
            return (Criteria) this;
        }

        public Criteria andStuImgEqualTo(String value) {
            addCriterion("stu_img =", value, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuImgNotEqualTo(String value) {
            addCriterion("stu_img <>", value, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuImgGreaterThan(String value) {
            addCriterion("stu_img >", value, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuImgGreaterThanOrEqualTo(String value) {
            addCriterion("stu_img >=", value, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuImgLessThan(String value) {
            addCriterion("stu_img <", value, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuImgLessThanOrEqualTo(String value) {
            addCriterion("stu_img <=", value, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuImgLike(String value) {
            addCriterion("stu_img like", value, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuImgNotLike(String value) {
            addCriterion("stu_img not like", value, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuImgIn(List<String> values) {
            addCriterion("stu_img in", values, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuImgNotIn(List<String> values) {
            addCriterion("stu_img not in", values, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuImgBetween(String value1, String value2) {
            addCriterion("stu_img between", value1, value2, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuImgNotBetween(String value1, String value2) {
            addCriterion("stu_img not between", value1, value2, "stuImg");
            return (Criteria) this;
        }

        public Criteria andStuBirIsNull() {
            addCriterion("stu_bir is null");
            return (Criteria) this;
        }

        public Criteria andStuBirIsNotNull() {
            addCriterion("stu_bir is not null");
            return (Criteria) this;
        }

        public Criteria andStuBirEqualTo(Date value) {
            addCriterionForJDBCDate("stu_bir =", value, "stuBir");
            return (Criteria) this;
        }

        public Criteria andStuBirNotEqualTo(Date value) {
            addCriterionForJDBCDate("stu_bir <>", value, "stuBir");
            return (Criteria) this;
        }

        public Criteria andStuBirGreaterThan(Date value) {
            addCriterionForJDBCDate("stu_bir >", value, "stuBir");
            return (Criteria) this;
        }

        public Criteria andStuBirGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_bir >=", value, "stuBir");
            return (Criteria) this;
        }

        public Criteria andStuBirLessThan(Date value) {
            addCriterionForJDBCDate("stu_bir <", value, "stuBir");
            return (Criteria) this;
        }

        public Criteria andStuBirLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_bir <=", value, "stuBir");
            return (Criteria) this;
        }

        public Criteria andStuBirIn(List<Date> values) {
            addCriterionForJDBCDate("stu_bir in", values, "stuBir");
            return (Criteria) this;
        }

        public Criteria andStuBirNotIn(List<Date> values) {
            addCriterionForJDBCDate("stu_bir not in", values, "stuBir");
            return (Criteria) this;
        }

        public Criteria andStuBirBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_bir between", value1, value2, "stuBir");
            return (Criteria) this;
        }

        public Criteria andStuBirNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_bir not between", value1, value2, "stuBir");
            return (Criteria) this;
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

        public Criteria andStuHomeIsNull() {
            addCriterion("stu_home is null");
            return (Criteria) this;
        }

        public Criteria andStuHomeIsNotNull() {
            addCriterion("stu_home is not null");
            return (Criteria) this;
        }

        public Criteria andStuHomeEqualTo(Integer value) {
            addCriterion("stu_home =", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeNotEqualTo(Integer value) {
            addCriterion("stu_home <>", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeGreaterThan(Integer value) {
            addCriterion("stu_home >", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_home >=", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeLessThan(Integer value) {
            addCriterion("stu_home <", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeLessThanOrEqualTo(Integer value) {
            addCriterion("stu_home <=", value, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeIn(List<Integer> values) {
            addCriterion("stu_home in", values, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeNotIn(List<Integer> values) {
            addCriterion("stu_home not in", values, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeBetween(Integer value1, Integer value2) {
            addCriterion("stu_home between", value1, value2, "stuHome");
            return (Criteria) this;
        }

        public Criteria andStuHomeNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_home not between", value1, value2, "stuHome");
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