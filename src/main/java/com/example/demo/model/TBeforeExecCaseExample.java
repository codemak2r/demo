package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TBeforeExecCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public TBeforeExecCaseExample() {
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

    public TBeforeExecCaseExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TBeforeExecCaseExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        rows = null;
        offset = null;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getRows() {
        return this.rows;
    }

    public TBeforeExecCaseExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public TBeforeExecCaseExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public TBeforeExecCaseExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        TBeforeExecCaseExample example = new TBeforeExecCaseExample();
        return example.createCriteria();
    }

    public TBeforeExecCaseExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TBeforeExecCaseExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
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

        public Criteria andIdEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
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

        public Criteria andBeforeCaseIdIsNull() {
            addCriterion("before_case_id is null");
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdIsNotNull() {
            addCriterion("before_case_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdEqualTo(Long value) {
            addCriterion("before_case_id =", value, "beforeCaseId");
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("before_case_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdNotEqualTo(Long value) {
            addCriterion("before_case_id <>", value, "beforeCaseId");
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdNotEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("before_case_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdGreaterThan(Long value) {
            addCriterion("before_case_id >", value, "beforeCaseId");
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdGreaterThanColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("before_case_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("before_case_id >=", value, "beforeCaseId");
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdGreaterThanOrEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("before_case_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdLessThan(Long value) {
            addCriterion("before_case_id <", value, "beforeCaseId");
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdLessThanColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("before_case_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("before_case_id <=", value, "beforeCaseId");
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdLessThanOrEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("before_case_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdIn(List<Long> values) {
            addCriterion("before_case_id in", values, "beforeCaseId");
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdNotIn(List<Long> values) {
            addCriterion("before_case_id not in", values, "beforeCaseId");
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdBetween(Long value1, Long value2) {
            addCriterion("before_case_id between", value1, value2, "beforeCaseId");
            return (Criteria) this;
        }

        public Criteria andBeforeCaseIdNotBetween(Long value1, Long value2) {
            addCriterion("before_case_id not between", value1, value2, "beforeCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdIsNull() {
            addCriterion("exec_case_id is null");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdIsNotNull() {
            addCriterion("exec_case_id is not null");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdEqualTo(Long value) {
            addCriterion("exec_case_id =", value, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("exec_case_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExecCaseIdNotEqualTo(Long value) {
            addCriterion("exec_case_id <>", value, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdNotEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("exec_case_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExecCaseIdGreaterThan(Long value) {
            addCriterion("exec_case_id >", value, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdGreaterThanColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("exec_case_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExecCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("exec_case_id >=", value, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdGreaterThanOrEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("exec_case_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExecCaseIdLessThan(Long value) {
            addCriterion("exec_case_id <", value, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdLessThanColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("exec_case_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExecCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("exec_case_id <=", value, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdLessThanOrEqualToColumn(TBeforeExecCase.Column column) {
            addCriterion(new StringBuilder("exec_case_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExecCaseIdIn(List<Long> values) {
            addCriterion("exec_case_id in", values, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdNotIn(List<Long> values) {
            addCriterion("exec_case_id not in", values, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdBetween(Long value1, Long value2) {
            addCriterion("exec_case_id between", value1, value2, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdNotBetween(Long value1, Long value2) {
            addCriterion("exec_case_id not between", value1, value2, "execCaseId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TBeforeExecCaseExample example;

        protected Criteria(TBeforeExecCaseExample example) {
            super();
            this.example = example;
        }

        public TBeforeExecCaseExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
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

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.example.demo.model.TBeforeExecCaseExample example);
    }
}