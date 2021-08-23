package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TAfterExecCasesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public TAfterExecCasesExample() {
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

    public TAfterExecCasesExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TAfterExecCasesExample orderBy(String ... orderByClauses) {
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

    public TAfterExecCasesExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public TAfterExecCasesExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public TAfterExecCasesExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        TAfterExecCasesExample example = new TAfterExecCasesExample();
        return example.createCriteria();
    }

    public TAfterExecCasesExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TAfterExecCasesExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(TAfterExecCases.Column column) {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Long value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("project_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("project_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("project_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("project_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("project_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("project_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdIsNull() {
            addCriterion("after_case_id is null");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdIsNotNull() {
            addCriterion("after_case_id is not null");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdEqualTo(Long value) {
            addCriterion("after_case_id =", value, "afterCaseId");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("after_case_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdNotEqualTo(Long value) {
            addCriterion("after_case_id <>", value, "afterCaseId");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdNotEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("after_case_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdGreaterThan(Long value) {
            addCriterion("after_case_id >", value, "afterCaseId");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdGreaterThanColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("after_case_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("after_case_id >=", value, "afterCaseId");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdGreaterThanOrEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("after_case_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdLessThan(Long value) {
            addCriterion("after_case_id <", value, "afterCaseId");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdLessThanColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("after_case_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("after_case_id <=", value, "afterCaseId");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdLessThanOrEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("after_case_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdIn(List<Long> values) {
            addCriterion("after_case_id in", values, "afterCaseId");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdNotIn(List<Long> values) {
            addCriterion("after_case_id not in", values, "afterCaseId");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdBetween(Long value1, Long value2) {
            addCriterion("after_case_id between", value1, value2, "afterCaseId");
            return (Criteria) this;
        }

        public Criteria andAfterCaseIdNotBetween(Long value1, Long value2) {
            addCriterion("after_case_id not between", value1, value2, "afterCaseId");
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

        public Criteria andExecCaseIdEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("exec_case_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExecCaseIdNotEqualTo(Long value) {
            addCriterion("exec_case_id <>", value, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdNotEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("exec_case_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExecCaseIdGreaterThan(Long value) {
            addCriterion("exec_case_id >", value, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdGreaterThanColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("exec_case_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExecCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("exec_case_id >=", value, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdGreaterThanOrEqualToColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("exec_case_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExecCaseIdLessThan(Long value) {
            addCriterion("exec_case_id <", value, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdLessThanColumn(TAfterExecCases.Column column) {
            addCriterion(new StringBuilder("exec_case_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExecCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("exec_case_id <=", value, "execCaseId");
            return (Criteria) this;
        }

        public Criteria andExecCaseIdLessThanOrEqualToColumn(TAfterExecCases.Column column) {
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
        private TAfterExecCasesExample example;

        protected Criteria(TAfterExecCasesExample example) {
            super();
            this.example = example;
        }

        public TAfterExecCasesExample example() {
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
        void example(com.example.demo.model.TAfterExecCasesExample example);
    }
}