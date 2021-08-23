package com.example.demo.dto;

import com.example.demo.model.TEndCases;
import com.example.demo.model.TEndConfs;
import com.example.demo.model.TEndSteps;
import lombok.Data;

import java.util.List;

/**
 * @author: zw.wen
 */
@Data
public class DetailsCaseForEnd {
    private TEndCases tEndCases;
    private TEndConfs tEndConfs;
    private List<TEndCases> beforeCases;
    private List<TEndCases> afterCases;
    private List<TEndSteps> steps;

}
