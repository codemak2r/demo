package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Data
public class TEndCase implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String desc;
    private Integer status;
    private Integer result;
    private String owner;
    private String creator;
    private String modifier;
    private Date createTime;
    private Date modifyTime;

    public enum Column {
        id("id", "id", "BIGINT", false),
        name("name", "name", "VARCHAR", true),
        desc("desc", "desc", "VARCHAR", true),
        status("status", "status", "INTEGER", true),
        result("result", "result", "INTEGER", true),
        owner("owner", "owner", "VARCHAR", true),
        creator("creator", "creator", "VARCHAR", false),
        modifier("modifier", "modifier", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        modifyTime("modify_time", "modifyTime", "TIMESTAMP", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public static Column[] excludes(Column... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

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

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
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