package com.example.distributed.transaction.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMqMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TMqMessageExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNull() {
            addCriterion("biz_id is null");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNotNull() {
            addCriterion("biz_id is not null");
            return (Criteria) this;
        }

        public Criteria andBizIdEqualTo(Long value) {
            addCriterion("biz_id =", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotEqualTo(Long value) {
            addCriterion("biz_id <>", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThan(Long value) {
            addCriterion("biz_id >", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThanOrEqualTo(Long value) {
            addCriterion("biz_id >=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThan(Long value) {
            addCriterion("biz_id <", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThanOrEqualTo(Long value) {
            addCriterion("biz_id <=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdIn(List<Long> values) {
            addCriterion("biz_id in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotIn(List<Long> values) {
            addCriterion("biz_id not in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdBetween(Long value1, Long value2) {
            addCriterion("biz_id between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotBetween(Long value1, Long value2) {
            addCriterion("biz_id not between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(Byte value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(Byte value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(Byte value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(Byte value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(Byte value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<Byte> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<Byte> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(Byte value1, Byte value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andMsgResultIsNull() {
            addCriterion("msg_result is null");
            return (Criteria) this;
        }

        public Criteria andMsgResultIsNotNull() {
            addCriterion("msg_result is not null");
            return (Criteria) this;
        }

        public Criteria andMsgResultEqualTo(Byte value) {
            addCriterion("msg_result =", value, "msgResult");
            return (Criteria) this;
        }

        public Criteria andMsgResultNotEqualTo(Byte value) {
            addCriterion("msg_result <>", value, "msgResult");
            return (Criteria) this;
        }

        public Criteria andMsgResultGreaterThan(Byte value) {
            addCriterion("msg_result >", value, "msgResult");
            return (Criteria) this;
        }

        public Criteria andMsgResultGreaterThanOrEqualTo(Byte value) {
            addCriterion("msg_result >=", value, "msgResult");
            return (Criteria) this;
        }

        public Criteria andMsgResultLessThan(Byte value) {
            addCriterion("msg_result <", value, "msgResult");
            return (Criteria) this;
        }

        public Criteria andMsgResultLessThanOrEqualTo(Byte value) {
            addCriterion("msg_result <=", value, "msgResult");
            return (Criteria) this;
        }

        public Criteria andMsgResultIn(List<Byte> values) {
            addCriterion("msg_result in", values, "msgResult");
            return (Criteria) this;
        }

        public Criteria andMsgResultNotIn(List<Byte> values) {
            addCriterion("msg_result not in", values, "msgResult");
            return (Criteria) this;
        }

        public Criteria andMsgResultBetween(Byte value1, Byte value2) {
            addCriterion("msg_result between", value1, value2, "msgResult");
            return (Criteria) this;
        }

        public Criteria andMsgResultNotBetween(Byte value1, Byte value2) {
            addCriterion("msg_result not between", value1, value2, "msgResult");
            return (Criteria) this;
        }

        public Criteria andMsgDescIsNull() {
            addCriterion("msg_desc is null");
            return (Criteria) this;
        }

        public Criteria andMsgDescIsNotNull() {
            addCriterion("msg_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMsgDescEqualTo(String value) {
            addCriterion("msg_desc =", value, "msgDesc");
            return (Criteria) this;
        }

        public Criteria andMsgDescNotEqualTo(String value) {
            addCriterion("msg_desc <>", value, "msgDesc");
            return (Criteria) this;
        }

        public Criteria andMsgDescGreaterThan(String value) {
            addCriterion("msg_desc >", value, "msgDesc");
            return (Criteria) this;
        }

        public Criteria andMsgDescGreaterThanOrEqualTo(String value) {
            addCriterion("msg_desc >=", value, "msgDesc");
            return (Criteria) this;
        }

        public Criteria andMsgDescLessThan(String value) {
            addCriterion("msg_desc <", value, "msgDesc");
            return (Criteria) this;
        }

        public Criteria andMsgDescLessThanOrEqualTo(String value) {
            addCriterion("msg_desc <=", value, "msgDesc");
            return (Criteria) this;
        }

        public Criteria andMsgDescLike(String value) {
            addCriterion("msg_desc like", value, "msgDesc");
            return (Criteria) this;
        }

        public Criteria andMsgDescNotLike(String value) {
            addCriterion("msg_desc not like", value, "msgDesc");
            return (Criteria) this;
        }

        public Criteria andMsgDescIn(List<String> values) {
            addCriterion("msg_desc in", values, "msgDesc");
            return (Criteria) this;
        }

        public Criteria andMsgDescNotIn(List<String> values) {
            addCriterion("msg_desc not in", values, "msgDesc");
            return (Criteria) this;
        }

        public Criteria andMsgDescBetween(String value1, String value2) {
            addCriterion("msg_desc between", value1, value2, "msgDesc");
            return (Criteria) this;
        }

        public Criteria andMsgDescNotBetween(String value1, String value2) {
            addCriterion("msg_desc not between", value1, value2, "msgDesc");
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
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTryCountIsNull() {
            addCriterion("try_count is null");
            return (Criteria) this;
        }

        public Criteria andTryCountIsNotNull() {
            addCriterion("try_count is not null");
            return (Criteria) this;
        }

        public Criteria andTryCountEqualTo(Integer value) {
            addCriterion("try_count =", value, "tryCount");
            return (Criteria) this;
        }

        public Criteria andTryCountNotEqualTo(Integer value) {
            addCriterion("try_count <>", value, "tryCount");
            return (Criteria) this;
        }

        public Criteria andTryCountGreaterThan(Integer value) {
            addCriterion("try_count >", value, "tryCount");
            return (Criteria) this;
        }

        public Criteria andTryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("try_count >=", value, "tryCount");
            return (Criteria) this;
        }

        public Criteria andTryCountLessThan(Integer value) {
            addCriterion("try_count <", value, "tryCount");
            return (Criteria) this;
        }

        public Criteria andTryCountLessThanOrEqualTo(Integer value) {
            addCriterion("try_count <=", value, "tryCount");
            return (Criteria) this;
        }

        public Criteria andTryCountIn(List<Integer> values) {
            addCriterion("try_count in", values, "tryCount");
            return (Criteria) this;
        }

        public Criteria andTryCountNotIn(List<Integer> values) {
            addCriterion("try_count not in", values, "tryCount");
            return (Criteria) this;
        }

        public Criteria andTryCountBetween(Integer value1, Integer value2) {
            addCriterion("try_count between", value1, value2, "tryCount");
            return (Criteria) this;
        }

        public Criteria andTryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("try_count not between", value1, value2, "tryCount");
            return (Criteria) this;
        }
    }

    /**
     */
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