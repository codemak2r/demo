package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.Data;

@Data
public class TEndSteps implements Serializable {
    private Long id;

    private Long tCaseId;

    private String action;

    private String elementType;

    private String element;

    private String val;

    private Double orderNo;

    private static final long serialVersionUID = 1L;

    public static TEndSteps.Builder builder() {
        return new TEndSteps.Builder();
    }

    public static class Builder {
        private TEndSteps obj;

        public Builder() {
            this.obj = new TEndSteps();
        }

        public Builder id(Long id) {
            obj.setId(id);
            return this;
        }

        public Builder tCaseId(Long tCaseId) {
            obj.setTCaseId(tCaseId);
            return this;
        }

        public Builder action(String action) {
            obj.setAction(action);
            return this;
        }

        public Builder element(String element) {
            obj.setElement(element);
            return this;
        }

        public Builder elementType(String elementType) {
            obj.setElementType(elementType);
            return this;
        }

        public Builder val(String val) {
            obj.setVal(val);
            return this;
        }

        public Builder orderNo(Double orderNo) {
            obj.setOrderNo(orderNo);
            return this;
        }

        public TEndSteps build() {
            return this.obj;
        }
    }

    public enum Column {
        id("id", "id", "BIGINT", false),
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