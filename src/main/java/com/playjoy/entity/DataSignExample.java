package com.playjoy.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DataSignExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    public DataSignExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_sign
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data_sign
     *
     * @mbg.generated
     */
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

        public Criteria andSignidIsNull() {
            addCriterion("signid is null");
            return (Criteria) this;
        }

        public Criteria andSignidIsNotNull() {
            addCriterion("signid is not null");
            return (Criteria) this;
        }

        public Criteria andSignidEqualTo(String value) {
            addCriterion("signid =", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotEqualTo(String value) {
            addCriterion("signid <>", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThan(String value) {
            addCriterion("signid >", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThanOrEqualTo(String value) {
            addCriterion("signid >=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThan(String value) {
            addCriterion("signid <", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThanOrEqualTo(String value) {
            addCriterion("signid <=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLike(String value) {
            addCriterion("signid like", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotLike(String value) {
            addCriterion("signid not like", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidIn(List<String> values) {
            addCriterion("signid in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotIn(List<String> values) {
            addCriterion("signid not in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidBetween(String value1, String value2) {
            addCriterion("signid between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotBetween(String value1, String value2) {
            addCriterion("signid not between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNull() {
            addCriterion("sign_date is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sign_date >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(Date value) {
            addCriterionForJDBCDate("sign_date <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andStartupTimeIsNull() {
            addCriterion("startup_time is null");
            return (Criteria) this;
        }

        public Criteria andStartupTimeIsNotNull() {
            addCriterion("startup_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartupTimeEqualTo(Date value) {
            addCriterion("startup_time =", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeNotEqualTo(Date value) {
            addCriterion("startup_time <>", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeGreaterThan(Date value) {
            addCriterion("startup_time >", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startup_time >=", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeLessThan(Date value) {
            addCriterion("startup_time <", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeLessThanOrEqualTo(Date value) {
            addCriterion("startup_time <=", value, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeIn(List<Date> values) {
            addCriterion("startup_time in", values, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeNotIn(List<Date> values) {
            addCriterion("startup_time not in", values, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeBetween(Date value1, Date value2) {
            addCriterion("startup_time between", value1, value2, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupTimeNotBetween(Date value1, Date value2) {
            addCriterion("startup_time not between", value1, value2, "startupTime");
            return (Criteria) this;
        }

        public Criteria andStartupPosidIsNull() {
            addCriterion("startup_posid is null");
            return (Criteria) this;
        }

        public Criteria andStartupPosidIsNotNull() {
            addCriterion("startup_posid is not null");
            return (Criteria) this;
        }

        public Criteria andStartupPosidEqualTo(String value) {
            addCriterion("startup_posid =", value, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andStartupPosidNotEqualTo(String value) {
            addCriterion("startup_posid <>", value, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andStartupPosidGreaterThan(String value) {
            addCriterion("startup_posid >", value, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andStartupPosidGreaterThanOrEqualTo(String value) {
            addCriterion("startup_posid >=", value, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andStartupPosidLessThan(String value) {
            addCriterion("startup_posid <", value, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andStartupPosidLessThanOrEqualTo(String value) {
            addCriterion("startup_posid <=", value, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andStartupPosidLike(String value) {
            addCriterion("startup_posid like", value, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andStartupPosidNotLike(String value) {
            addCriterion("startup_posid not like", value, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andStartupPosidIn(List<String> values) {
            addCriterion("startup_posid in", values, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andStartupPosidNotIn(List<String> values) {
            addCriterion("startup_posid not in", values, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andStartupPosidBetween(String value1, String value2) {
            addCriterion("startup_posid between", value1, value2, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andStartupPosidNotBetween(String value1, String value2) {
            addCriterion("startup_posid not between", value1, value2, "startupPosid");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNull() {
            addCriterion("off_time is null");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNotNull() {
            addCriterion("off_time is not null");
            return (Criteria) this;
        }

        public Criteria andOffTimeEqualTo(Date value) {
            addCriterion("off_time =", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotEqualTo(Date value) {
            addCriterion("off_time <>", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThan(Date value) {
            addCriterion("off_time >", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("off_time >=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThan(Date value) {
            addCriterion("off_time <", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThanOrEqualTo(Date value) {
            addCriterion("off_time <=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIn(List<Date> values) {
            addCriterion("off_time in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotIn(List<Date> values) {
            addCriterion("off_time not in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeBetween(Date value1, Date value2) {
            addCriterion("off_time between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotBetween(Date value1, Date value2) {
            addCriterion("off_time not between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffPosidIsNull() {
            addCriterion("off_posid is null");
            return (Criteria) this;
        }

        public Criteria andOffPosidIsNotNull() {
            addCriterion("off_posid is not null");
            return (Criteria) this;
        }

        public Criteria andOffPosidEqualTo(String value) {
            addCriterion("off_posid =", value, "offPosid");
            return (Criteria) this;
        }

        public Criteria andOffPosidNotEqualTo(String value) {
            addCriterion("off_posid <>", value, "offPosid");
            return (Criteria) this;
        }

        public Criteria andOffPosidGreaterThan(String value) {
            addCriterion("off_posid >", value, "offPosid");
            return (Criteria) this;
        }

        public Criteria andOffPosidGreaterThanOrEqualTo(String value) {
            addCriterion("off_posid >=", value, "offPosid");
            return (Criteria) this;
        }

        public Criteria andOffPosidLessThan(String value) {
            addCriterion("off_posid <", value, "offPosid");
            return (Criteria) this;
        }

        public Criteria andOffPosidLessThanOrEqualTo(String value) {
            addCriterion("off_posid <=", value, "offPosid");
            return (Criteria) this;
        }

        public Criteria andOffPosidLike(String value) {
            addCriterion("off_posid like", value, "offPosid");
            return (Criteria) this;
        }

        public Criteria andOffPosidNotLike(String value) {
            addCriterion("off_posid not like", value, "offPosid");
            return (Criteria) this;
        }

        public Criteria andOffPosidIn(List<String> values) {
            addCriterion("off_posid in", values, "offPosid");
            return (Criteria) this;
        }

        public Criteria andOffPosidNotIn(List<String> values) {
            addCriterion("off_posid not in", values, "offPosid");
            return (Criteria) this;
        }

        public Criteria andOffPosidBetween(String value1, String value2) {
            addCriterion("off_posid between", value1, value2, "offPosid");
            return (Criteria) this;
        }

        public Criteria andOffPosidNotBetween(String value1, String value2) {
            addCriterion("off_posid not between", value1, value2, "offPosid");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNull() {
            addCriterion("deleteflag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNotNull() {
            addCriterion("deleteflag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagEqualTo(Boolean value) {
            addCriterion("deleteflag =", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotEqualTo(Boolean value) {
            addCriterion("deleteflag <>", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThan(Boolean value) {
            addCriterion("deleteflag >", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteflag >=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThan(Boolean value) {
            addCriterion("deleteflag <", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteflag <=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIn(List<Boolean> values) {
            addCriterion("deleteflag in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotIn(List<Boolean> values) {
            addCriterion("deleteflag not in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteflag between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteflag not between", value1, value2, "deleteflag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data_sign
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data_sign
     *
     * @mbg.generated
     */
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