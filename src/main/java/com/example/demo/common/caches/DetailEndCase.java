package com.example.demo.common.caches;

import com.example.demo.model.TEndCase;
import com.example.demo.model.TEndConf;
import com.example.demo.model.TEndSteps;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author: zw.wen
 */
@Getter
@Setter
public class DetailEndCase {
    private TEndCase tEndCase;
    private TEndConf tEndConf;
    private List<TEndSteps> tEndSteps;
}
