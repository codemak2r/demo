package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;

@Data
public class TEndCase implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public static TEndCase.Builder builder() {
        return new TEndCase.Builder();
    }

    public static class Builder {
        private TEndCase obj;

        public Builder() {
            this.obj = new TEndCase();
        }

        public Builder id(Long id) {
            obj.setId(id);
            return this;
        }

        public Builder name(String name) {
            obj.setName(name);
            return this;
        }

        public Builder desc(String desc) {
            obj.setDesc(desc);
            return this;
        }

        public Builder status(Integer status) {
            obj.setStatus(status);
            return this;
        }

        public Builder result(Integer result) {
            obj.setResult(result);
            return this;
        }

        public Builder owner(String owner) {
            obj.setOwner(owner);
            return this;
        }

        public Builder creator(String creator) {
            obj.setCreator(creator);
            return this;
        }

        public Builder modifier(String modifier) {
            obj.setModifier(modifier);
            return this;
        }

        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public Builder modifyTime(Date modifyTime) {
            obj.setModifyTime(modifyTime);
            return this;
        }

        public TEndCase build() {
            return this.obj;
        }
    }

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