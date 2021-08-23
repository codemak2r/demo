package com.example.demo.controller;

import com.example.demo.dto.DetailsCaseForEnd;
import com.example.demo.dto.TEndCaseDetails;
import com.example.demo.model.*;
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

    @GetMapping("/projects")
    @ApiOperation(value = "获取全部 project")
    public List<TEndProjects> getAllProjects(){
        List<TEndProjects> projects = endService.getAllProjects();
        return projects;
    }

    @PostMapping("/projects")
    @ApiOperation(value = "创建 project")
    public Boolean createProject(@RequestBody TEndProjects project){
        endService.createProject(project);
        return true;
    }

    @DeleteMapping("/projects/{projectId}")
    @ApiOperation(value = "删除project")
    public Boolean deleteProject(@PathVariable(value = "projectId") Long projectId){
        endService.deleteProject(projectId);
        return true;
    }

    @PutMapping("/projects/{projectId}")
    @ApiOperation(value = "更新 project")
    public Boolean updateProject(@PathVariable(value = "projectId") Long projectId, @RequestBody TEndProjects tEndProjects) {
        endService.updateProject(projectId, tEndProjects);
        return true;
    }

    @GetMapping("/{projectId}/cases")
    @ApiOperation(value = "获取全部 Case")
    public List<TEndCases> getAllCases(@PathVariable(value = "projectId") Long projectId){
        List<TEndCases> caseList = endService.getAllCases(projectId);
        return caseList;
    }

    @GetMapping("/cases/{caseId}")
    @ApiOperation(value = "获取具体case")
    public DetailsCaseForEnd getDetailCase(@PathVariable(value = "caseId") Long caseId){
        DetailsCaseForEnd tEndCaseDetails = new DetailsCaseForEnd();
        tEndCaseDetails.setTEndCases(endService.getBasicInfo(caseId));
        tEndCaseDetails.setTEndConfs(endService.getConf(caseId));
        tEndCaseDetails.setSteps(endService.getAllSteps(caseId));
        tEndCaseDetails.setBeforeCases(endService.getAllBeforeCases(caseId));
        tEndCaseDetails.setAfterCases(endService.getAllAfterCases(caseId));
        return tEndCaseDetails;
    }
    @DeleteMapping("cases")
    public void deleteCase(Long id ){
        endService.deleteCase(id);
    }

    @PostMapping("/{projectId}/cases")
    @ApiOperation(value = "创建case")
    public Boolean createCase(@PathVariable(value = "projectId") Long projectId,
                           @RequestBody TEndCaseDetails tEndCaseDetails){
        endService.createCase(projectId, tEndCaseDetails);
        return true;
    }
    @PostMapping("/cases/{caseId}")
    @ApiOperation(value = "修改case 基本信息")
    public Boolean modifyBasic(@PathVariable(value = "caseId")Long caseId,
                                      @RequestBody TEndCases tEndCases)
    {
        endService.modifyBasicInfo(caseId, tEndCases);
        return true;
    }

    @PostMapping("/cases/{caseId}/conf")
    @ApiOperation(value = "修改case 配置信息")
    public Boolean modifyConf(@PathVariable(value = "caseId")Long caseId,
                                      @RequestBody TEndConfs tEndConfs)
    {
        endService.modifyConf(caseId, tEndConfs);
        return true;
    }

    @PostMapping("/cases/{caseId}/before")
    @ApiOperation(value = "增加case 前置脚本")
    public Boolean modifyBeforeScript(@PathVariable(value = "caseId")Long caseId,
                                      @RequestBody TBeforeExecCases tBeforeExecCases){
        endService.addBeforeCase(caseId, tBeforeExecCases);
        return true;
    }

    @PostMapping("/cases/{caseId}/after")
    @ApiOperation(value = "增加case 后置脚本")
    public Boolean modifyAfterScript(@PathVariable(value = "caseId") Long caseId,
                                     @RequestBody TAfterExecCases tAfterExecCases){
        endService.addAfterCase(caseId, tAfterExecCases);
        return true;
    }

    @DeleteMapping("/cases/{caseId}/before/{beforeCaseId}")
    @ApiOperation(value = "删除case 前置脚本")
    public Boolean deleteBeforeScript(@PathVariable(value = "caseId")Long caseId,
                                      @PathVariable(value = "beforeCaseId") Long beforeCaseId){
        endService.deletedBeforeCaseByCaseId(caseId, beforeCaseId);
        return true;
    }

    @DeleteMapping("/cases/{caseId}/after/{afterCaseId}")
    @ApiOperation(value = "删除case 后置脚本")
    public Boolean deleteAfterScript(@PathVariable(value = "caseId") Long caseId,
                                     @PathVariable(value = "afterCaseId") Long afterCaseId){
        endService.deletedAfterCasesByCaseId(caseId, afterCaseId);
        return true;
    }

    @PostMapping("/cases/{caseId}/steps")
    @ApiOperation(value = "增加步骤")
    public Boolean addStep(@PathVariable(value = "caseId") Long caseId, @RequestBody TEndSteps tEndSteps){
        endService.addStep(caseId, tEndSteps);
        return true;
    }

    @PutMapping("/cases/{caseId}/steps")
    @ApiOperation(value = "修改步骤")
    public Boolean modifyStep(@PathVariable(value = "caseId") Long caseId,
                                @RequestBody TEndSteps tEndStep)
    {
        endService.modifySteps(caseId, tEndStep);
        return true;
    }

    @DeleteMapping("/cases/{caseId}/steps/{stepId}")
    @ApiOperation(value = "删除步骤")
    public Boolean deleteStep(@PathVariable(value = "caseId") Long caseId,
                            @PathVariable(value = "stepId") Long stepId)
    {
        endService.deleteStep(caseId, stepId);
        return true;
    }

    @GetMapping("/execution/cases")
    public void executeCase(Long id){
        endService.runCase(id);
    }


}
