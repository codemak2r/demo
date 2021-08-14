package com.example.demo.dto;

import lombok.Data;

/**
 * @author: zw.wen
 */
@Data
public class EndStepsParams {

    private Long tCaseId;

    private String action;

    private String elementType;

    private String element;

    private String val;

    private double orderNo;
}
