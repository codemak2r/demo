package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Testcase implements Serializable {
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
}