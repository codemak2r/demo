package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TEndReportsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public TEndReportsExample() {
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

    public TEndReportsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TEndReportsExample orderBy(String ... orderByClauses) {
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

    public TEndReportsExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public TEndReportsExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public TEndReportsExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        TEndReportsExample example = new TEndReportsExample();
        return example.createCriteria();
    }

    public TEndReportsExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TEndReportsExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(TEndReports.Column column) {
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

        public Criteria andProjectIdEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("project_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("project_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("project_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("project_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("project_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualToColumn(TEndReports.Column column) {
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

        public Criteria andTCaseIdIsNull() {
            addCriterion("t_case_id is null");
            return (Criteria) this;
        }

        public Criteria andTCaseIdIsNotNull() {
            addCriterion("t_case_id is not null");
            return (Criteria) this;
        }

        public Criteria andTCaseIdEqualTo(Long value) {
            addCriterion("t_case_id =", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("t_case_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdNotEqualTo(Long value) {
            addCriterion("t_case_id <>", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdNotEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("t_case_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThan(Long value) {
            addCriterion("t_case_id >", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThanColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("t_case_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_case_id >=", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThanOrEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("t_case_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThan(Long value) {
            addCriterion("t_case_id <", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThanColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("t_case_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("t_case_id <=", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThanOrEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("t_case_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdIn(List<Long> values) {
            addCriterion("t_case_id in", values, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdNotIn(List<Long> values) {
            addCriterion("t_case_id not in", values, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdBetween(Long value1, Long value2) {
            addCriterion("t_case_id between", value1, value2, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdNotBetween(Long value1, Long value2) {
            addCriterion("t_case_id not between", value1, value2, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("`result` is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("`result` is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Integer value) {
            addCriterion("`result` =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("`result` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Integer value) {
            addCriterion("`result` <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("`result` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Integer value) {
            addCriterion("`result` >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("`result` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("`result` >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("`result` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Integer value) {
            addCriterion("`result` <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("`result` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Integer value) {
            addCriterion("`result` <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("`result` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Integer> values) {
            addCriterion("`result` in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Integer> values) {
            addCriterion("`result` not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Integer value1, Integer value2) {
            addCriterion("`result` between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Integer value1, Integer value2) {
            addCriterion("`result` not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andScreenIsNull() {
            addCriterion("screen is null");
            return (Criteria) this;
        }

        public Criteria andScreenIsNotNull() {
            addCriterion("screen is not null");
            return (Criteria) this;
        }

        public Criteria andScreenEqualTo(String value) {
            addCriterion("screen =", value, "screen");
            return (Criteria) this;
        }

        public Criteria andScreenEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("screen = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScreenNotEqualTo(String value) {
            addCriterion("screen <>", value, "screen");
            return (Criteria) this;
        }

        public Criteria andScreenNotEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("screen <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScreenGreaterThan(String value) {
            addCriterion("screen >", value, "screen");
            return (Criteria) this;
        }

        public Criteria andScreenGreaterThanColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("screen > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScreenGreaterThanOrEqualTo(String value) {
            addCriterion("screen >=", value, "screen");
            return (Criteria) this;
        }

        public Criteria andScreenGreaterThanOrEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("screen >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScreenLessThan(String value) {
            addCriterion("screen <", value, "screen");
            return (Criteria) this;
        }

        public Criteria andScreenLessThanColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("screen < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScreenLessThanOrEqualTo(String value) {
            addCriterion("screen <=", value, "screen");
            return (Criteria) this;
        }

        public Criteria andScreenLessThanOrEqualToColumn(TEndReports.Column column) {
            addCriterion(new StringBuilder("screen <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andScreenLike(String value) {
            addCriterion("screen like", value, "screen");
            return (Criteria) this;
        }

        public Criteria andScreenNotLike(String value) {
            addCriterion("screen not like", value, "screen");
            return (Criteria) this;
        }

        public Criteria andScreenIn(List<String> values) {
            addCriterion("screen in", values, "screen");
            return (Criteria) this;
        }

        public Criteria andScreenNotIn(List<String> values) {
            addCriterion("screen not in", values, "screen");
            return (Criteria) this;
        }

        public Criteria andScreenBetween(String value1, String value2) {
            addCriterion("screen between", value1, value2, "screen");
            return (Criteria) this;
        }

        public Criteria andScreenNotBetween(String value1, String value2) {
            addCriterion("screen not between", value1, value2, "screen");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TEndReportsExample example;

        protected Criteria(TEndReportsExample example) {
            super();
            this.example = example;
        }

        public TEndReportsExample example() {
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
        void example(com.example.demo.model.TEndReportsExample example);
    }
}