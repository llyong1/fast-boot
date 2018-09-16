package cn.llyong.boot.domain.cm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmSeqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmSeqExample() {
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

        public Criteria andSeqTypeIsNull() {
            addCriterion("seq_type is null");
            return (Criteria) this;
        }

        public Criteria andSeqTypeIsNotNull() {
            addCriterion("seq_type is not null");
            return (Criteria) this;
        }

        public Criteria andSeqTypeEqualTo(String value) {
            addCriterion("seq_type =", value, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeNotEqualTo(String value) {
            addCriterion("seq_type <>", value, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeGreaterThan(String value) {
            addCriterion("seq_type >", value, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeGreaterThanOrEqualTo(String value) {
            addCriterion("seq_type >=", value, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeLessThan(String value) {
            addCriterion("seq_type <", value, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeLessThanOrEqualTo(String value) {
            addCriterion("seq_type <=", value, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeLike(String value) {
            addCriterion("seq_type like", value, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeNotLike(String value) {
            addCriterion("seq_type not like", value, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeIn(List<String> values) {
            addCriterion("seq_type in", values, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeNotIn(List<String> values) {
            addCriterion("seq_type not in", values, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeBetween(String value1, String value2) {
            addCriterion("seq_type between", value1, value2, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeNotBetween(String value1, String value2) {
            addCriterion("seq_type not between", value1, value2, "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescIsNull() {
            addCriterion("seq_type_desc is null");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescIsNotNull() {
            addCriterion("seq_type_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescEqualTo(String value) {
            addCriterion("seq_type_desc =", value, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescNotEqualTo(String value) {
            addCriterion("seq_type_desc <>", value, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescGreaterThan(String value) {
            addCriterion("seq_type_desc >", value, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("seq_type_desc >=", value, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescLessThan(String value) {
            addCriterion("seq_type_desc <", value, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescLessThanOrEqualTo(String value) {
            addCriterion("seq_type_desc <=", value, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescLike(String value) {
            addCriterion("seq_type_desc like", value, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescNotLike(String value) {
            addCriterion("seq_type_desc not like", value, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescIn(List<String> values) {
            addCriterion("seq_type_desc in", values, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescNotIn(List<String> values) {
            addCriterion("seq_type_desc not in", values, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescBetween(String value1, String value2) {
            addCriterion("seq_type_desc between", value1, value2, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescNotBetween(String value1, String value2) {
            addCriterion("seq_type_desc not between", value1, value2, "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqHeadIsNull() {
            addCriterion("seq_head is null");
            return (Criteria) this;
        }

        public Criteria andSeqHeadIsNotNull() {
            addCriterion("seq_head is not null");
            return (Criteria) this;
        }

        public Criteria andSeqHeadEqualTo(String value) {
            addCriterion("seq_head =", value, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqHeadNotEqualTo(String value) {
            addCriterion("seq_head <>", value, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqHeadGreaterThan(String value) {
            addCriterion("seq_head >", value, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqHeadGreaterThanOrEqualTo(String value) {
            addCriterion("seq_head >=", value, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqHeadLessThan(String value) {
            addCriterion("seq_head <", value, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqHeadLessThanOrEqualTo(String value) {
            addCriterion("seq_head <=", value, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqHeadLike(String value) {
            addCriterion("seq_head like", value, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqHeadNotLike(String value) {
            addCriterion("seq_head not like", value, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqHeadIn(List<String> values) {
            addCriterion("seq_head in", values, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqHeadNotIn(List<String> values) {
            addCriterion("seq_head not in", values, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqHeadBetween(String value1, String value2) {
            addCriterion("seq_head between", value1, value2, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqHeadNotBetween(String value1, String value2) {
            addCriterion("seq_head not between", value1, value2, "seqHead");
            return (Criteria) this;
        }

        public Criteria andSeqLengthIsNull() {
            addCriterion("seq_length is null");
            return (Criteria) this;
        }

        public Criteria andSeqLengthIsNotNull() {
            addCriterion("seq_length is not null");
            return (Criteria) this;
        }

        public Criteria andSeqLengthEqualTo(Integer value) {
            addCriterion("seq_length =", value, "seqLength");
            return (Criteria) this;
        }

        public Criteria andSeqLengthNotEqualTo(Integer value) {
            addCriterion("seq_length <>", value, "seqLength");
            return (Criteria) this;
        }

        public Criteria andSeqLengthGreaterThan(Integer value) {
            addCriterion("seq_length >", value, "seqLength");
            return (Criteria) this;
        }

        public Criteria andSeqLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("seq_length >=", value, "seqLength");
            return (Criteria) this;
        }

        public Criteria andSeqLengthLessThan(Integer value) {
            addCriterion("seq_length <", value, "seqLength");
            return (Criteria) this;
        }

        public Criteria andSeqLengthLessThanOrEqualTo(Integer value) {
            addCriterion("seq_length <=", value, "seqLength");
            return (Criteria) this;
        }

        public Criteria andSeqLengthIn(List<Integer> values) {
            addCriterion("seq_length in", values, "seqLength");
            return (Criteria) this;
        }

        public Criteria andSeqLengthNotIn(List<Integer> values) {
            addCriterion("seq_length not in", values, "seqLength");
            return (Criteria) this;
        }

        public Criteria andSeqLengthBetween(Integer value1, Integer value2) {
            addCriterion("seq_length between", value1, value2, "seqLength");
            return (Criteria) this;
        }

        public Criteria andSeqLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("seq_length not between", value1, value2, "seqLength");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoIsNull() {
            addCriterion("cur_seq_no is null");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoIsNotNull() {
            addCriterion("cur_seq_no is not null");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoEqualTo(Long value) {
            addCriterion("cur_seq_no =", value, "curSeqNo");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoNotEqualTo(Long value) {
            addCriterion("cur_seq_no <>", value, "curSeqNo");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoGreaterThan(Long value) {
            addCriterion("cur_seq_no >", value, "curSeqNo");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoGreaterThanOrEqualTo(Long value) {
            addCriterion("cur_seq_no >=", value, "curSeqNo");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoLessThan(Long value) {
            addCriterion("cur_seq_no <", value, "curSeqNo");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoLessThanOrEqualTo(Long value) {
            addCriterion("cur_seq_no <=", value, "curSeqNo");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoIn(List<Long> values) {
            addCriterion("cur_seq_no in", values, "curSeqNo");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoNotIn(List<Long> values) {
            addCriterion("cur_seq_no not in", values, "curSeqNo");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoBetween(Long value1, Long value2) {
            addCriterion("cur_seq_no between", value1, value2, "curSeqNo");
            return (Criteria) this;
        }

        public Criteria andCurSeqNoNotBetween(Long value1, Long value2) {
            addCriterion("cur_seq_no not between", value1, value2, "curSeqNo");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNull() {
            addCriterion("min_value is null");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNotNull() {
            addCriterion("min_value is not null");
            return (Criteria) this;
        }

        public Criteria andMinValueEqualTo(Long value) {
            addCriterion("min_value =", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotEqualTo(Long value) {
            addCriterion("min_value <>", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThan(Long value) {
            addCriterion("min_value >", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThanOrEqualTo(Long value) {
            addCriterion("min_value >=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThan(Long value) {
            addCriterion("min_value <", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThanOrEqualTo(Long value) {
            addCriterion("min_value <=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueIn(List<Long> values) {
            addCriterion("min_value in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotIn(List<Long> values) {
            addCriterion("min_value not in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueBetween(Long value1, Long value2) {
            addCriterion("min_value between", value1, value2, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotBetween(Long value1, Long value2) {
            addCriterion("min_value not between", value1, value2, "minValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNull() {
            addCriterion("max_value is null");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNotNull() {
            addCriterion("max_value is not null");
            return (Criteria) this;
        }

        public Criteria andMaxValueEqualTo(Long value) {
            addCriterion("max_value =", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotEqualTo(Long value) {
            addCriterion("max_value <>", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThan(Long value) {
            addCriterion("max_value >", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThanOrEqualTo(Long value) {
            addCriterion("max_value >=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThan(Long value) {
            addCriterion("max_value <", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThanOrEqualTo(Long value) {
            addCriterion("max_value <=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIn(List<Long> values) {
            addCriterion("max_value in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotIn(List<Long> values) {
            addCriterion("max_value not in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueBetween(Long value1, Long value2) {
            addCriterion("max_value between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotBetween(Long value1, Long value2) {
            addCriterion("max_value not between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
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

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andSeqTypeLikeInsensitive(String value) {
            addCriterion("upper(seq_type) like", value.toUpperCase(), "seqType");
            return (Criteria) this;
        }

        public Criteria andSeqTypeDescLikeInsensitive(String value) {
            addCriterion("upper(seq_type_desc) like", value.toUpperCase(), "seqTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSeqHeadLikeInsensitive(String value) {
            addCriterion("upper(seq_head) like", value.toUpperCase(), "seqHead");
            return (Criteria) this;
        }

        public Criteria andCreaterLikeInsensitive(String value) {
            addCriterion("upper(creater) like", value.toUpperCase(), "creater");
            return (Criteria) this;
        }

        public Criteria andModifierLikeInsensitive(String value) {
            addCriterion("upper(modifier) like", value.toUpperCase(), "modifier");
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