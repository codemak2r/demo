package com.example.demo.controller;

import cn.hutool.json.JSONUtil;
import com.example.demo.common.GlobalResult;
import com.example.demo.dto.EndParams;
import com.example.demo.service.EndService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/case")
    public GlobalResult runCase(Long caseId) {
        return GlobalResult.success();
    }

    @PutMapping("/case")
    public GlobalResult createCase(EndParams endParams) {
        log.info(JSONUtil.toJsonPrettyStr(endParams));
        endService.createCase(endParams);
        return GlobalResult.success();
    }
}
