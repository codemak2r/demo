package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SelfVar implements Serializable {
    private Long id;

    private String name;

    private String val;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}