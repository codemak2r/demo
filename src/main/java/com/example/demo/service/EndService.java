package com.example.demo.service;

import cn.hutool.json.JSONUtil;
import com.example.demo.dto.TEndCaseDetails;
import com.example.demo.mappers.*;
import com.example.demo.model.*;
import com.example.demo.utils.SeleniumUtil;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: zw.wen
 */
@Service
@Slf4j
public class EndService {
    @Autowired
    TEndCasesMapper tEndCasesMapper;

    @Autowired
    TEndConfsMapper tEndConfsMapper;

    @Autowired
    TEndStepsMapper tEndStepsMapper;

    @Autowired
    TEndProjectsMapper tEndProjectsMapper;

    @Autowired
    TBeforeExecCasesMapper tBeforeExecCasesMapper;

    @Autowired
    TAfterExecCasesMapper tAfterExecCasesMapper;

    @Autowired
    TEndReportsMapper tEndReportsMapper;

    /**
     * 创建 project
     * @param tEndProjects
     * @return
     */
    @CachePut(value  = "projects", key = "'projects'")
    @Transactional(rollbackFor = Exception.class)
    public List<TEndProjects> createProject(TEndProjects tEndProjects){
        tEndProjects.setCreatedTime(new Date());
        tEndProjectsMapper.insert(tEndProjects);
        return tEndProjectsMapper.selectByExample(null);
    }

    /**
     * 查询全部的 project
     * @return
     */
    @Cacheable(value = "projects", key = "'projects'")
    public List<TEndProjects> getAllProjects() {
        PageHelper.startPage(1, 20);
        return tEndProjectsMapper.selectByExample(null);
    }

    /**
     * 删除project
     * @param projectId
     */
    @Caching(
       evict = {
           @CacheEvict(value = "projects", key = "'projects'",allEntries=true),
           @CacheEvict(value = "cases", key = "'cases'",allEntries=true),
           @CacheEvict(value = "conf", key = "'conf'",allEntries=true),
           @CacheEvict(value = "basicInfo", key = "'basicInfo'",allEntries=true),
           @CacheEvict(value = "steps", key = "'steps'",allEntries=true),
           @CacheEvict(value = "beforeCase", key = "'beforeCase'",allEntries=true),
           @CacheEvict(value = "afterCase", key = "'afterCase'",allEntries=true)
       }
    )
    public void deleteProject(Long projectId){
        log.info("projectId: " + projectId);
        tEndProjectsMapper.deleteByPrimaryKey(projectId);
        TEndCasesExample tEndCasesExample = new TEndCasesExample();
        tEndCasesExample.createCriteria().andProjectIdEqualTo(projectId);
        TEndConfsExample tEndConfsExample = new TEndConfsExample();
        tEndConfsExample.createCriteria().andProjectIdEqualTo(projectId);
        TEndStepsExample tEndStepsExample = new TEndStepsExample();
        tEndStepsExample.createCriteria().andProjectIdEqualTo(projectId);
        TBeforeExecCasesExample tBeforeExecCasesExample = new TBeforeExecCasesExample();
        tBeforeExecCasesExample.createCriteria().andProjectIdEqualTo(projectId);
        TAfterExecCasesExample tAfterExecCasesExample = new TAfterExecCasesExample();
        tAfterExecCasesExample.createCriteria().andProjectIdEqualTo(projectId);
        tEndCasesMapper.deleteByExample(tEndCasesExample);
        tEndConfsMapper.deleteByExample(tEndConfsExample);
        tBeforeExecCasesMapper.deleteByExample(tBeforeExecCasesExample);
        tAfterExecCasesMapper.deleteByExample(tAfterExecCasesExample);
        tEndStepsMapper.deleteByExample(tEndStepsExample);
        TEndReportsExample tEndReportsExample = new TEndReportsExample();
        tAfterExecCasesExample.createCriteria().andProjectIdEqualTo(projectId);
        tEndReportsMapper.deleteByExample(tEndReportsExample);

    }

    /**
     * 更新 project
     * @param projectId
     * @param tEndProjects
     * @return
     */
    @CachePut(value = "projects", key = "'projects'")
    public List<TEndProjects> updateProject(Long projectId, TEndProjects tEndProjects){
        tEndProjects.setId(projectId);
        tEndProjects.setModifiedTime(new Date());
        tEndProjectsMapper.updateByPrimaryKeySelective(tEndProjects);
        return tEndProjectsMapper.selectByExample(null);
    }

    /**
     * 获取这个 project 下面所有的 case
     * @param projectId
     * @return
     */
//    @Cacheable(value = "cases", key ="'cases_'+ #projectId")
    public List<TEndCases> getAllCases(Long projectId) {
        PageHelper.startPage(1, 20);
        TEndCasesExample tEndCasesExample = new TEndCasesExample();
        tEndCasesExample.createCriteria().andProjectIdEqualTo(projectId);
        return tEndCasesMapper.selectByExample(tEndCasesExample);
    }

    /**
     * 新建
     * @param tEndCaseDetails
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @CachePut(value = "cases", key ="'cases_'+ #projectId")
    public List<TEndCases> createCase(Long projectId, TEndCaseDetails tEndCaseDetails) {
        TEndCases tEndCase = tEndCaseDetails.getTEndCases();
        log.info("ProjectID :" + projectId);
        tEndCase.setProjectId(projectId);
        tEndCase.setCreatedTime(new Date());
        log.info(JSONUtil.toJsonPrettyStr(tEndCase));
        tEndCasesMapper.insert(tEndCase);

        TEndConfs tEndConfs = tEndCaseDetails.getTEndConfs();
        tEndConfs.setTCaseId(tEndCase.getId());
        tEndConfs.setProjectId(projectId);
        tEndConfsMapper.insert(tEndConfs);

        List<TEndSteps> tEndSteps = tEndCaseDetails.getTEndSteps();
        tEndSteps.forEach(item -> {
            item.setTCaseId(tEndCase.getId());
            item.setProjectId(projectId);
        });

        List<TBeforeExecCases> tBeforeExecCasesList = new LinkedList<>();
        List<TAfterExecCases> tAfterExecCasesList = new LinkedList<>();

        if(tEndCaseDetails.getBeforeCases()!=null) {
            tEndCaseDetails.getBeforeCases().forEach(item -> {
                TBeforeExecCases tBeforeExecCases = new TBeforeExecCases();
                tBeforeExecCases.setBeforeCaseId(item);
                tBeforeExecCases.setProjectId(projectId);
                tBeforeExecCases.setExecCaseId(tEndCase.getId());
                log.info("插入的值是：" + item);
                tBeforeExecCasesList.add(tBeforeExecCases);
            });
            tBeforeExecCasesMapper.batchInsert(tBeforeExecCasesList);
        }

        if(tEndCaseDetails.getAfterCases()!=null){
            tEndCaseDetails.getAfterCases().forEach(item -> {
                TAfterExecCases tAfterExecCases = new TAfterExecCases();
                tAfterExecCases.setExecCaseId(tEndCase.getId());
                tAfterExecCases.setAfterCaseId(item);
                tAfterExecCases.setProjectId(projectId);
                tAfterExecCasesList.add(tAfterExecCases);
            });
            tAfterExecCasesMapper.batchInsert(tAfterExecCasesList);
        }

        tEndStepsMapper.batchInsert(tEndSteps);
        return this.getAllCases(projectId);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCase(Long caseId) {
        tEndCasesMapper.deleteByPrimaryKey(caseId);
        TEndConfsExample tEndConfsExample = new TEndConfsExample();
        tEndConfsExample.createCriteria().andTCaseIdEqualTo(caseId);
        tEndConfsMapper.deleteByExample(tEndConfsExample);
        TEndStepsExample tEndStepsExample = new TEndStepsExample();
        tEndStepsExample.createCriteria().andTCaseIdEqualTo(caseId);
        tEndStepsMapper.deleteByExample(tEndStepsExample);

    }
    /**
     * 获取详细的信息 - 基本信息
     * @param caseId
     * @return
     */
//    @Cacheable(value = "basicInfo", key = "'basicInfo_'+#caseId")
    public TEndCases getBasicInfo(Long caseId) {
        TEndCases tEndCases = tEndCasesMapper.selectByPrimaryKey(caseId);
        return tEndCases;
    }

    /**
     * 获取详细信息 - 配置信息
     * @param caseId
     * @return
     */
//    @Cacheable(cacheNames = "conf")
    public TEndConfs getConf(Long caseId) {
        TEndConfsExample tEndConfsExample = new TEndConfsExample();
        tEndConfsExample.createCriteria().andTCaseIdEqualTo(caseId);
        TEndConfs tEndConfs = tEndConfsMapper.selectOneByExample(tEndConfsExample);
        return tEndConfs;
    }

    /**
     * 获取所有的前置脚本
     * @param caseId
     * @return
     */
//    @Cacheable(value = "beforeCase" , key = "'beforeCase'")
    public List<TEndCases> getAllBeforeCases(Long caseId) {
        TBeforeExecCasesExample tBeforeExecCasesExample = new TBeforeExecCasesExample();
        tBeforeExecCasesExample.createCriteria().andExecCaseIdEqualTo(caseId);
        List<TBeforeExecCases> tBeforeExecCasesList = tBeforeExecCasesMapper.selectByExample(tBeforeExecCasesExample);

        List<TEndCases> beforeCaseList =  new LinkedList<>();
        tBeforeExecCasesList.forEach(item -> {
            TEndCasesExample t = new TEndCasesExample();
            t.createCriteria().andIdEqualTo(item.getBeforeCaseId());
            TEndCases ts = tEndCasesMapper.selectOneByExample(t);
            beforeCaseList.add(ts);
        });
        return beforeCaseList;
    }

    /**
     * 获取所有的后置脚本
     * @param caseId
     * @return
     */
//    @Cacheable(value = "afterCase" , key = "'afterCase'")
    public List<TEndCases> getAllAfterCases(Long caseId) {
        TAfterExecCasesExample tAfterExecCasesExample = new TAfterExecCasesExample();
        tAfterExecCasesExample.createCriteria().andExecCaseIdEqualTo(caseId);
        List<TAfterExecCases> tAfterExecCasesList = tAfterExecCasesMapper.selectByExample(tAfterExecCasesExample);

        List<TEndCases> afterCaseList =  new LinkedList<>();
        tAfterExecCasesList.forEach(item -> {
            TEndCasesExample t = new TEndCasesExample();
            t.createCriteria().andIdEqualTo(item.getAfterCaseId());
            TEndCases ts = tEndCasesMapper.selectOneByExample(t);
            afterCaseList.add(ts);
        });

        return afterCaseList;
    }

    /**
     * 获取全部步骤
     * @param caseId
     * @return
     */
//    @Cacheable(value = "steps", key = "'steps'")
    public List<TEndSteps> getAllSteps(Long caseId){
        TEndStepsExample tEndStepsExample = new TEndStepsExample();
        tEndStepsExample.createCriteria().andTCaseIdEqualTo(caseId);
        List<TEndSteps> tEndStepsList = tEndStepsMapper.selectByExample(tEndStepsExample);
        return tEndStepsList;
    }


    /**
     * 更新基本信息
     * @param caseId
     * @param tEndCases
     * @return
     */
//    @CachePut(value = "basicInfo", key = "'basicInfo'")
    @Transactional(rollbackFor = Exception.class)
    public TEndCases modifyBasicInfo(Long caseId, TEndCases tEndCases) {
        tEndCases.setModifiedTime(new Date());
        tEndCases.setId(caseId);
        tEndCasesMapper.updateByPrimaryKeySelective(tEndCases);
        return tEndCases;
    }

    /**
     * 更新配置信息
     * @param caseId
     * @param tEndConfs
     * @return
     */
//    @CachePut(value = "conf", key = "'conf'")
    @Transactional(rollbackFor = Exception.class)
    public TEndConfs modifyConf(Long caseId, TEndConfs tEndConfs) {
        tEndConfs.setTCaseId(caseId);
        TEndConfsExample tEndConfsExample = new TEndConfsExample();
        tEndConfsExample.createCriteria().andTCaseIdEqualTo(caseId);
        tEndConfsMapper.updateByExampleSelective(tEndConfs, tEndConfsExample);
        return tEndConfs;
    }

    /**
     * 增加前置脚本
     * @param caseId
     * @param
     * @return
     */
//    @CachePut(value = "beforeCase", key = "'beforeCase'")
    @Transactional(rollbackFor = Exception.class)
    public TBeforeExecCases addBeforeCase(Long caseId, TBeforeExecCases tBeforeExecCases) {
        tBeforeExecCases.setExecCaseId(caseId);
        tBeforeExecCasesMapper.insert(tBeforeExecCases);
        return tBeforeExecCases;
    }

    /**
     * 增加后置脚本
     * @param caseId
     * @param
     * @return
     */
//    @CachePut(value = "afterCase", key = "'afterCase'")
    @Transactional(rollbackFor = Exception.class)
    public TAfterExecCases addAfterCase(Long caseId, TAfterExecCases t) {
        t.setExecCaseId(caseId);
        tAfterExecCasesMapper.insert(t);
        return t;
    }

    /**
     * 增加步骤
     * @param tEndSteps
     * @return
     */
//    @CachePut(value = "steps", key = "'steps'")
    @Transactional(rollbackFor = Exception.class)
    public List<TEndSteps> addStep(Long caseId, TEndSteps tEndSteps) {
        tEndSteps.setTCaseId(caseId);
        tEndStepsMapper.insert(tEndSteps);
        return this.getAllSteps(tEndSteps.getTCaseId());
    }

    /**
     * 删除步骤
     * @param caseId
     * @param stepId
     * @return
     */
//    @CacheEvict(value = "steps", key = "'steps'")
    @Transactional(rollbackFor = Exception.class)
    public List<TEndSteps> deleteStep(Long caseId, Long stepId) {
        tEndStepsMapper.deleteByPrimaryKey(stepId);
        return this.getAllSteps(caseId);
    }

    /**
     * 修改某个步骤
     * @param caseId
     * @param tEndSteps
     * @return
     */
    public List<TEndSteps> modifySteps(Long caseId, TEndSteps tEndSteps){

        tEndStepsMapper.updateByPrimaryKeySelective(tEndSteps);
        return this.getAllSteps(caseId);
    }

    /**
     * 删除前置脚本
     * @param caseId
     * @param beforeId
     */
//    @CacheEvict(value = "beforeCase", key = "'beforeCase'")
    @Transactional(rollbackFor = Exception.class)
    public void deletedBeforeCaseByCaseId(Long caseId, Long beforeId) {
        TBeforeExecCasesExample tBeforeExecCasesExample = new TBeforeExecCasesExample();
        tBeforeExecCasesExample.createCriteria().andExecCaseIdEqualTo(caseId).andBeforeCaseIdEqualTo(beforeId);
        tBeforeExecCasesMapper.deleteByExample(tBeforeExecCasesExample);
    }

    /**
     * 删除后置脚本
     * @param caseId
     * @param afterId
     */
//    @CacheEvict(value = "afterCase", key = "'afterCase'")
    @Transactional(rollbackFor = Exception.class)
    public void deletedAfterCasesByCaseId(Long caseId, Long afterId) {
        TAfterExecCasesExample tAfterExecCasesExample = new TAfterExecCasesExample();
        tAfterExecCasesExample.createCriteria().andExecCaseIdEqualTo(caseId).andAfterCaseIdEqualTo(afterId);
        tAfterExecCasesMapper.deleteByExample(tAfterExecCasesExample);
    }

    @Async
    public void runCase(Long caseId){
        List<TEndSteps> tEndSteps = new LinkedList<>();
//        TBeforeExecCasesExample tBeforeExecCasesExample = new TBeforeExecCasesExample();
//        tBeforeExecCasesExample.createCriteria().andExecCaseIdEqualTo(caseId);
//        List<TBeforeExecCases> tBeforeExecCasesList = tBeforeExecCasesMapper.selectByExample(tBeforeExecCasesExample);
//        tBeforeExecCasesList.forEach(item -> {
//            tEndSteps.addAll(this.getAllSteps(item.getBeforeCaseId()));
//        });

        tEndSteps.addAll(this.getAllSteps(caseId));
        TEndConfs tEndConfs = this.getConf(caseId);
        int browser = tEndConfs.getBrowser();
        String url = tEndConfs.getTestUrl();
        SeleniumUtil seleniumUtil = new SeleniumUtil(browser, url);
        tEndSteps.forEach(step -> {
             seleniumUtil.invoke(step.getAction(),
                     step.getElementType(),
                     step.getElement(),
                     step.getVal());
        });

    }
}
