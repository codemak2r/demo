package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TEndConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public TEndConfExample() {
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

    public TEndConfExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TEndConfExample orderBy(String ... orderByClauses) {
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

    public TEndConfExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public TEndConfExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public TEndConfExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        TEndConfExample example = new TEndConfExample();
        return example.createCriteria();
    }

    public TEndConfExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TEndConfExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(TEndConf.Column column) {
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

        public Criteria andBrowserIsNull() {
            addCriterion("browser is null");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNotNull() {
            addCriterion("browser is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserEqualTo(Integer value) {
            addCriterion("browser =", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("browser = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserNotEqualTo(Integer value) {
            addCriterion("browser <>", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("browser <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThan(Integer value) {
            addCriterion("browser >", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("browser > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanOrEqualTo(Integer value) {
            addCriterion("browser >=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("browser >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserLessThan(Integer value) {
            addCriterion("browser <", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("browser < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanOrEqualTo(Integer value) {
            addCriterion("browser <=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("browser <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserIn(List<Integer> values) {
            addCriterion("browser in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotIn(List<Integer> values) {
            addCriterion("browser not in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserBetween(Integer value1, Integer value2) {
            addCriterion("browser between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotBetween(Integer value1, Integer value2) {
            addCriterion("browser not between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthIsNull() {
            addCriterion("window_size_width is null");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthIsNotNull() {
            addCriterion("window_size_width is not null");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthEqualTo(Integer value) {
            addCriterion("window_size_width =", value, "windowSizeWidth");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_width = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthNotEqualTo(Integer value) {
            addCriterion("window_size_width <>", value, "windowSizeWidth");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthNotEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_width <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthGreaterThan(Integer value) {
            addCriterion("window_size_width >", value, "windowSizeWidth");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthGreaterThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_width > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("window_size_width >=", value, "windowSizeWidth");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthGreaterThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_width >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthLessThan(Integer value) {
            addCriterion("window_size_width <", value, "windowSizeWidth");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthLessThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_width < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthLessThanOrEqualTo(Integer value) {
            addCriterion("window_size_width <=", value, "windowSizeWidth");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthLessThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_width <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthIn(List<Integer> values) {
            addCriterion("window_size_width in", values, "windowSizeWidth");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthNotIn(List<Integer> values) {
            addCriterion("window_size_width not in", values, "windowSizeWidth");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthBetween(Integer value1, Integer value2) {
            addCriterion("window_size_width between", value1, value2, "windowSizeWidth");
            return (Criteria) this;
        }

        public Criteria andWindowSizeWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("window_size_width not between", value1, value2, "windowSizeWidth");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightIsNull() {
            addCriterion("window_size_height is null");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightIsNotNull() {
            addCriterion("window_size_height is not null");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightEqualTo(Integer value) {
            addCriterion("window_size_height =", value, "windowSizeHeight");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_height = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightNotEqualTo(Integer value) {
            addCriterion("window_size_height <>", value, "windowSizeHeight");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightNotEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_height <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightGreaterThan(Integer value) {
            addCriterion("window_size_height >", value, "windowSizeHeight");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightGreaterThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_height > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("window_size_height >=", value, "windowSizeHeight");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightGreaterThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_height >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightLessThan(Integer value) {
            addCriterion("window_size_height <", value, "windowSizeHeight");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightLessThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_height < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightLessThanOrEqualTo(Integer value) {
            addCriterion("window_size_height <=", value, "windowSizeHeight");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightLessThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("window_size_height <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightIn(List<Integer> values) {
            addCriterion("window_size_height in", values, "windowSizeHeight");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightNotIn(List<Integer> values) {
            addCriterion("window_size_height not in", values, "windowSizeHeight");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightBetween(Integer value1, Integer value2) {
            addCriterion("window_size_height between", value1, value2, "windowSizeHeight");
            return (Criteria) this;
        }

        public Criteria andWindowSizeHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("window_size_height not between", value1, value2, "windowSizeHeight");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessIsNull() {
            addCriterion("is_headless is null");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessIsNotNull() {
            addCriterion("is_headless is not null");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessEqualTo(Integer value) {
            addCriterion("is_headless =", value, "isHeadless");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("is_headless = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsHeadlessNotEqualTo(Integer value) {
            addCriterion("is_headless <>", value, "isHeadless");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessNotEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("is_headless <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsHeadlessGreaterThan(Integer value) {
            addCriterion("is_headless >", value, "isHeadless");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessGreaterThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("is_headless > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsHeadlessGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_headless >=", value, "isHeadless");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessGreaterThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("is_headless >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsHeadlessLessThan(Integer value) {
            addCriterion("is_headless <", value, "isHeadless");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessLessThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("is_headless < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsHeadlessLessThanOrEqualTo(Integer value) {
            addCriterion("is_headless <=", value, "isHeadless");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessLessThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("is_headless <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsHeadlessIn(List<Integer> values) {
            addCriterion("is_headless in", values, "isHeadless");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessNotIn(List<Integer> values) {
            addCriterion("is_headless not in", values, "isHeadless");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessBetween(Integer value1, Integer value2) {
            addCriterion("is_headless between", value1, value2, "isHeadless");
            return (Criteria) this;
        }

        public Criteria andIsHeadlessNotBetween(Integer value1, Integer value2) {
            addCriterion("is_headless not between", value1, value2, "isHeadless");
            return (Criteria) this;
        }

        public Criteria andTestUrlIsNull() {
            addCriterion("test_url is null");
            return (Criteria) this;
        }

        public Criteria andTestUrlIsNotNull() {
            addCriterion("test_url is not null");
            return (Criteria) this;
        }

        public Criteria andTestUrlEqualTo(String value) {
            addCriterion("test_url =", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("test_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTestUrlNotEqualTo(String value) {
            addCriterion("test_url <>", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlNotEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("test_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTestUrlGreaterThan(String value) {
            addCriterion("test_url >", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlGreaterThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("test_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("test_url >=", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlGreaterThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("test_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTestUrlLessThan(String value) {
            addCriterion("test_url <", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlLessThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("test_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTestUrlLessThanOrEqualTo(String value) {
            addCriterion("test_url <=", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlLessThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("test_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTestUrlLike(String value) {
            addCriterion("test_url like", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlNotLike(String value) {
            addCriterion("test_url not like", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlIn(List<String> values) {
            addCriterion("test_url in", values, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlNotIn(List<String> values) {
            addCriterion("test_url not in", values, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlBetween(String value1, String value2) {
            addCriterion("test_url between", value1, value2, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlNotBetween(String value1, String value2) {
            addCriterion("test_url not between", value1, value2, "testUrl");
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

        public Criteria andTCaseIdEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("t_case_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdNotEqualTo(Long value) {
            addCriterion("t_case_id <>", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdNotEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("t_case_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThan(Long value) {
            addCriterion("t_case_id >", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("t_case_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_case_id >=", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThanOrEqualToColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("t_case_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThan(Long value) {
            addCriterion("t_case_id <", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThanColumn(TEndConf.Column column) {
            addCriterion(new StringBuilder("t_case_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("t_case_id <=", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThanOrEqualToColumn(TEndConf.Column column) {
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
    }

    public static class Criteria extends GeneratedCriteria {
        private TEndConfExample example;

        protected Criteria(TEndConfExample example) {
            super();
            this.example = example;
        }

        public TEndConfExample example() {
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
        void example(com.example.demo.model.TEndConfExample example);
    }
}