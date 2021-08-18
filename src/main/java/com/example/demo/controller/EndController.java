package com.example.demo.controller;

import cn.hutool.json.JSONUtil;
import com.example.demo.common.GlobalResult;
import com.example.demo.dto.EndParams;
import com.example.demo.model.TEndCase;
import com.example.demo.service.EndService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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

    /**
     * 查询所有的case
     * @return
     */
    @GetMapping("/cases")
    @ApiOperation(value = "查询所有的case", notes = "")
    public List<TEndCase> getCaseList() {
        List<TEndCase> tEndCases = endService.queryAllCases();
        return tEndCases;
    }

    /**
     * 查询具体的case
     * @param caseId
     * @return
     */
    @GetMapping("/cases/{caseId}")
    @ApiOperation(value = "查询具体的case")
    public TEndCase getCaseDetail(@PathVariable long caseId) {
        TEndCase tEndCases = endService.getDetailCase(caseId);
        return tEndCases;
    }

    /**
     * 执行具体的case
     * @param caseId
     * @return
     */
    @PostMapping("/cases/{caseId}")
    @ApiOperation(value = "执行具体的case")
    public GlobalResult runCase(@PathVariable Long caseId) {
        endService.runCase(caseId);
        return GlobalResult.success();
    }

    /**
     * 创建测试用例
     * @param endParams
     * @return
     */
    @PostMapping("/cases")
    @ApiOperation(value = "创建测试用例")
    public GlobalResult createCase(@RequestBody EndParams endParams) {
        log.info(JSONUtil.toJsonPrettyStr(endParams));
        endService.createCase(endParams);
        return GlobalResult.success();
    }

    /**
     * 删除具体的case
     * @param caseId
     * @return
     */
    @DeleteMapping("/cases/{caseId}")
    @ApiOperation(value = "删除具体的case")
    public void deleteCase(@PathVariable long caseId){

    }

    /**
     * 更新 case
     * @param caseId
     * @return
     */
    @PutMapping("/cases/{caseId}")
    @ApiOperation(value = "更新Case")
    public void updateConf(@PathVariable long caseId){

    }

    /**
     * 更新步骤
     * @param caseId
     * @param orderNo
     * @return
     */
    @PutMapping("/cases/{caseId}/step/{orderNo}")
    @ApiOperation(value = "更新步骤")
    public GlobalResult updateStep(@PathParam(value = "caseId") long caseId, @PathParam(value = "orderNo") double orderNo) {
        return GlobalResult.success();
    }

    /**
     *
     * @param caseId
     * @param orderNo
     * @return
     */
    @DeleteMapping("/cases/{caseId}/step/{orderNo}")
    @ApiOperation(value = "删除步骤")
    public GlobalResult deleteSteps(@PathParam(value = "caseId") long caseId, @PathParam(value = "orderNo") double orderNo) {
        return GlobalResult.success();
    }





}
