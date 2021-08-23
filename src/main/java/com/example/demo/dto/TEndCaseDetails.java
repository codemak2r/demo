package com.example.demo.dto;

import com.example.demo.model.TEndCases;
import com.example.demo.model.TEndConfs;
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
    @JsonProperty(value = "cases")
    private TEndCases tEndCases;

    @JsonProperty(value = "confs")
    private TEndConfs tEndConfs;

    @JsonProperty(value = "steps")
    private List<TEndSteps> tEndSteps;

    @JsonProperty(value = "before_scripts")
    private List<Long> beforeCases;

    @JsonProperty(value = "after_scripts")
    private List<Long> afterCases;
}
