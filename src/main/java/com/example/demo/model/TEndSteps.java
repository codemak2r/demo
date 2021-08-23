package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TEndSteps implements Serializable {
    private Long id;

    private Long projectId;

    private Long tCaseId;

    private String action;

    private String elementType;

    private String element;

    private String val;

    private Double orderNo;

    private static final long serialVersionUID = 1L;

    public enum Column {
        id("id", "id", "BIGINT", false),
        projectId("project_id", "projectId", "BIGINT", false),
        tCaseId("t_case_id", "tCaseId", "BIGINT", false),
        action("action", "action", "VARCHAR", true),
        elementType("element_type", "elementType", "VARCHAR", false),
        element("element", "element", "VARCHAR", true),
        val("val", "val", "VARCHAR", false),
        orderNo("order_no", "orderNo", "DOUBLE", false);

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