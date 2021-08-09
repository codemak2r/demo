package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.model.Testcase;
import com.example.demo.service.ApiAotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zw.wen
 */
@RestController
@RequestMapping("/v1/apitest")
public class ApiController {
    @Autowired
    ApiAotService apiAotService;

    @GetMapping("/")
    public Result getCaseList(){
        List<Testcase> testcaeList = apiAotService.queryList();
        return Result.success();
    }

}
