package com.example.demo.dto;

import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: zw.wen
 */
@Data
public class EndParams {

    private String name;

    private String desc;
    private String owner;
    private String creator;

    @JsonProperty(value = "conf")
    private EndConfParam endConfParam;

    @JsonProperty(value = "steps")
    private List<EndStepsParams> endStepsParamsList;

}
