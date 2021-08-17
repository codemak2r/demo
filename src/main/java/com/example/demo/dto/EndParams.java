package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: zw.wen
 */
@Data
public class EndParams {

    private String name;

    private String desc;
    private String owner;


    @JsonProperty(value = "conf")
    private EndConfParam endConfParam;

    @JsonProperty(value = "steps")
    private List<EndStepsParams> endStepsParamsList;

}
