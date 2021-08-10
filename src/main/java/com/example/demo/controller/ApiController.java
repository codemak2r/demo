package com.example.demo.controller;

import com.example.demo.common.GlobalResult;
import com.example.demo.model.Testcase;
import com.example.demo.service.ApiAotService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: zw.wen
 */
@Api(tags = "api测试")
@RestController
@RequestMapping("/v1/apitest")
public class ApiController {
    @Autowired
    ApiAotService apiAotService;

    @GetMapping("/")
    @ApiOperation(value = "测试用例列表", notes = "")
    public GlobalResult<List<Testcase>> getCaseList(){
        List<Testcase> testcaeList = apiAotService.queryList();
        return GlobalResult.success(testcaeList);
    }

    @GetMapping("/case")
    @ApiOperation(value = "测试用例详情", notes = "")
    public GlobalResult<Testcase> getDetailsCase(Long testcaseId){
        return GlobalResult.success();
    }

    @PostMapping("/case")
    @ApiOperation(value = "执行测试用例", notes = "")
    public GlobalResult<String> runCase(Long testcaseId){
        return GlobalResult.success();
    }

    @PostMapping("/case")
    @ApiOperation(value = "创建测试用例", notes = "")
    public GlobalResult<String> createCase(){
        return GlobalResult.success();
    }


}
