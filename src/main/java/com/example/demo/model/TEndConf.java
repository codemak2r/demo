package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.Data;

@Data
public class TEndConf implements Serializable {
    private Long id;

    private Integer browser;

    private String testUrl;

    private Long tCaseId;

    private static final long serialVersionUID = 1L;

    public static TEndConf.Builder builder() {
        return new TEndConf.Builder();
    }

    public static class Builder {
        private TEndConf obj;

        public Builder() {
            this.obj = new TEndConf();
        }

        public Builder id(Long id) {
            obj.setId(id);
            return this;
        }

        public Builder browser(Integer browser) {
            obj.setBrowser(browser);
            return this;
        }

        public Builder testUrl(String testUrl) {
            obj.setTestUrl(testUrl);
            return this;
        }

        public Builder tCaseId(Long tCaseId) {
            obj.setTCaseId(tCaseId);
            return this;
        }

        public TEndConf build() {
            return this.obj;
        }
    }

    public enum Column {
        id("id", "id", "BIGINT", false),
        browser("browser", "browser", "INTEGER", false),
        testUrl("test_url", "testUrl", "VARCHAR", false),
        tCaseId("t_case_id", "tCaseId", "BIGINT", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}