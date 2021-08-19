package com.example.demo.controller;

import com.example.demo.dto.TEndCaseDetails;
import com.example.demo.model.TEndCase;
import com.example.demo.service.EndService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: zw.wen
 */
@Api(tags = "e2e测试")
@RestController
@RequestMapping("/v1/end")
@Slf4j
public class EndController {

    @Autowired
    EndService endService;


    @GetMapping("/cases")
    @ApiOperation(value = "获取全部 Case")
    public List<TEndCase> getAllCases(){
        List<TEndCase> caseList = endService.getAllCases();
        return caseList;
    }

    @GetMapping("/cases/{caseId}")
    @ApiOperation(value = "获取具体case")
    public TEndCaseDetails getDetailCase(@PathVariable Long caseId){
        return endService.getDetailCase(caseId);
    }

    @PostMapping("/cases")
    @ApiOperation(value = "创建case")
    public void createCase(@RequestBody TEndCaseDetails tEndCaseDetails){
        endService.createCase(tEndCaseDetails);

    }

}
