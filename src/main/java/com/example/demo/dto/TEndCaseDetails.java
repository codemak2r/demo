package com.example.demo.dto;

import com.example.demo.model.TEndCase;
import com.example.demo.model.TEndConf;
import com.example.demo.model.TEndSteps;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: zw.wen
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TEndCaseDetails {
    @JsonProperty(value = "case")
    private TEndCase tEndCase;

    @JsonProperty(value = "conf")
    private TEndConf tEndConf;

    @JsonProperty(value = "steps")
    private List<TEndSteps> tEndSteps;
}
