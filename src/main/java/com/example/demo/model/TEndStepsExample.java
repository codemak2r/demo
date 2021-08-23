package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TEndStepsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public TEndStepsExample() {
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

    public TEndStepsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TEndStepsExample orderBy(String ... orderByClauses) {
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

    public TEndStepsExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public TEndStepsExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public TEndStepsExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        TEndStepsExample example = new TEndStepsExample();
        return example.createCriteria();
    }

    public TEndStepsExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TEndStepsExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(TEndSteps.Column column) {
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

        public Criteria andProjectIdEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("project_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("project_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("project_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("project_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("project_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualToColumn(TEndSteps.Column column) {
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

        public Criteria andTCaseIdEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("t_case_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdNotEqualTo(Long value) {
            addCriterion("t_case_id <>", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdNotEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("t_case_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThan(Long value) {
            addCriterion("t_case_id >", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("t_case_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_case_id >=", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("t_case_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThan(Long value) {
            addCriterion("t_case_id <", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("t_case_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("t_case_id <=", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThanOrEqualToColumn(TEndSteps.Column column) {
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

        public Criteria andActionIsNull() {
            addCriterion("`action` is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("`action` is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("`action` =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`action` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("`action` <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`action` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("`action` >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`action` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("`action` >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`action` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("`action` <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`action` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("`action` <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`action` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("`action` like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("`action` not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("`action` in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("`action` not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("`action` between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("`action` not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andElementTypeIsNull() {
            addCriterion("element_type is null");
            return (Criteria) this;
        }

        public Criteria andElementTypeIsNotNull() {
            addCriterion("element_type is not null");
            return (Criteria) this;
        }

        public Criteria andElementTypeEqualTo(String value) {
            addCriterion("element_type =", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("element_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementTypeNotEqualTo(String value) {
            addCriterion("element_type <>", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("element_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementTypeGreaterThan(String value) {
            addCriterion("element_type >", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeGreaterThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("element_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("element_type >=", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeGreaterThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("element_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementTypeLessThan(String value) {
            addCriterion("element_type <", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeLessThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("element_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementTypeLessThanOrEqualTo(String value) {
            addCriterion("element_type <=", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeLessThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("element_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementTypeLike(String value) {
            addCriterion("element_type like", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotLike(String value) {
            addCriterion("element_type not like", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeIn(List<String> values) {
            addCriterion("element_type in", values, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotIn(List<String> values) {
            addCriterion("element_type not in", values, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeBetween(String value1, String value2) {
            addCriterion("element_type between", value1, value2, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotBetween(String value1, String value2) {
            addCriterion("element_type not between", value1, value2, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementIsNull() {
            addCriterion("`element` is null");
            return (Criteria) this;
        }

        public Criteria andElementIsNotNull() {
            addCriterion("`element` is not null");
            return (Criteria) this;
        }

        public Criteria andElementEqualTo(String value) {
            addCriterion("`element` =", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`element` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementNotEqualTo(String value) {
            addCriterion("`element` <>", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`element` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementGreaterThan(String value) {
            addCriterion("`element` >", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementGreaterThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`element` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementGreaterThanOrEqualTo(String value) {
            addCriterion("`element` >=", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementGreaterThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`element` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementLessThan(String value) {
            addCriterion("`element` <", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementLessThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`element` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementLessThanOrEqualTo(String value) {
            addCriterion("`element` <=", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementLessThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("`element` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andElementLike(String value) {
            addCriterion("`element` like", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotLike(String value) {
            addCriterion("`element` not like", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementIn(List<String> values) {
            addCriterion("`element` in", values, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotIn(List<String> values) {
            addCriterion("`element` not in", values, "element");
            return (Criteria) this;
        }

        public Criteria andElementBetween(String value1, String value2) {
            addCriterion("`element` between", value1, value2, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotBetween(String value1, String value2) {
            addCriterion("`element` not between", value1, value2, "element");
            return (Criteria) this;
        }

        public Criteria andValIsNull() {
            addCriterion("val is null");
            return (Criteria) this;
        }

        public Criteria andValIsNotNull() {
            addCriterion("val is not null");
            return (Criteria) this;
        }

        public Criteria andValEqualTo(String value) {
            addCriterion("val =", value, "val");
            return (Criteria) this;
        }

        public Criteria andValEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("val = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValNotEqualTo(String value) {
            addCriterion("val <>", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("val <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValGreaterThan(String value) {
            addCriterion("val >", value, "val");
            return (Criteria) this;
        }

        public Criteria andValGreaterThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("val > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValGreaterThanOrEqualTo(String value) {
            addCriterion("val >=", value, "val");
            return (Criteria) this;
        }

        public Criteria andValGreaterThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("val >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValLessThan(String value) {
            addCriterion("val <", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLessThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("val < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValLessThanOrEqualTo(String value) {
            addCriterion("val <=", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLessThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("val <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andValLike(String value) {
            addCriterion("val like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotLike(String value) {
            addCriterion("val not like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValIn(List<String> values) {
            addCriterion("val in", values, "val");
            return (Criteria) this;
        }

        public Criteria andValNotIn(List<String> values) {
            addCriterion("val not in", values, "val");
            return (Criteria) this;
        }

        public Criteria andValBetween(String value1, String value2) {
            addCriterion("val between", value1, value2, "val");
            return (Criteria) this;
        }

        public Criteria andValNotBetween(String value1, String value2) {
            addCriterion("val not between", value1, value2, "val");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Double value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("order_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Double value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("order_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Double value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("order_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Double value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("order_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Double value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("order_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Double value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualToColumn(TEndSteps.Column column) {
            addCriterion(new StringBuilder("order_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Double> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Double> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Double value1, Double value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Double value1, Double value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TEndStepsExample example;

        protected Criteria(TEndStepsExample example) {
            super();
            this.example = example;
        }

        public TEndStepsExample example() {
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
        void example(com.example.demo.model.TEndStepsExample example);
    }
}