package com.example.demo.service;

import com.example.demo.common.caches.DetailEndCase;
import com.example.demo.dto.EndConfParam;
import com.example.demo.dto.EndParams;
import com.example.demo.dto.EndStepsParams;
import com.example.demo.mappers.TEndCaseMapper;
import com.example.demo.mappers.TEndConfMapper;
import com.example.demo.mappers.TEndStepsMapper;
import com.example.demo.model.*;
import com.example.demo.utils.SeleniumUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: zw.wen
 */
@Service
@Slf4j
public class EndService {
    @Resource
    TEndCaseMapper tEndCaseMapper;

    @Resource
    TEndStepsMapper tEndStepsMapper;

    @Resource
    TEndConfMapper tEndConfMapper;

    @Cacheable(cacheNames = "cases")
    public List<TEndCase> queryAllCases() {
        List<TEndCase> tEndCases = tEndCaseMapper.selectByExample(null);
        return tEndCases;
    }

    @Cacheable(cacheNames = "detailEndCase")
    public TEndCase getCaseById(long caseId) {
        return null;
    }

    @CachePut(cacheNames = "detailEndCase")
    public TEndCase updateCase(long caseId) {
        return null;
    }

    /**
     * @param caseId
     * @throws Exception
     */

    @Async
    public void runCase(Long caseId) {
        TEndConfExample tEndConfExample = new TEndConfExample();
        tEndConfExample.createCriteria().andTCaseIdEqualTo(caseId);
        TEndConf tEndConf = tEndConfMapper.selectByExample(tEndConfExample).get(0);

        TEndStepsExample tEndStepsExample = new TEndStepsExample();
        tEndStepsExample.setOrderByClause("order_no");
        tEndStepsExample.createCriteria().andTCaseIdEqualTo(caseId);
        List<TEndSteps> tEndSteps = tEndStepsMapper.selectByExample(tEndStepsExample);

        int browser = tEndConf.getBrowser();
        String url = tEndConf.getTestUrl();
        SeleniumUtil seleniumUtil = new SeleniumUtil(browser, url);

        for (TEndSteps t : tEndSteps) {
            String action = t.getAction();
            String elementType = t.getElementType();
            String element = t.getElement();
            String value = t.getVal();
            seleniumUtil.invoke(action, elementType, element, value);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @CachePut(cacheNames = "detailEndCase")
    public DetailEndCase createCase(EndParams endParams) {
        DetailEndCase detailEndCase = new DetailEndCase();

        String name = endParams.getName();
        String desc = endParams.getDesc();
        String owner = endParams.getOwner();
        TEndCase tEndCase = new TEndCase();
        tEndCase.setName(name);
        tEndCase.setDesc(desc);
        tEndCase.setOwner(owner);
        tEndCase.setCreateTime(new Date());
        tEndCaseMapper.insert(tEndCase);

        EndConfParam endConfParam = endParams.getEndConfParam();
        TEndConf tEndConf = new TEndConf();
        tEndConf.setTCaseId(tEndCase.getId());
        tEndConf.setBrowser(endConfParam.getBrowser());
        tEndConf.setTestUrl(endConfParam.getTestUrl());

        tEndConfMapper.insert(tEndConf);
        List<EndStepsParams> endStepsParamsList = endParams.getEndStepsParamsList();
        List<TEndSteps> tEndStepsList = new LinkedList<>();

        for (EndStepsParams endStepsParams : endStepsParamsList) {
            String action = endStepsParams.getAction();
            String elementType = endStepsParams.getElementType();
            String element = endStepsParams.getElement();
            String value = endStepsParams.getVal();
            Double order_no = endStepsParams.getOrderNo();
            TEndSteps tEndSteps = new TEndSteps();
            tEndSteps.setTCaseId(tEndCase.getId());
            tEndSteps.setAction(action);
            tEndSteps.setElementType(elementType);
            tEndSteps.setElement(element);
            tEndSteps.setVal(value);
            tEndSteps.setOrderNo(order_no);
            tEndStepsList.add(tEndSteps);
        }
        tEndStepsMapper.batchInsert(tEndStepsList);

        detailEndCase.setTEndCase(tEndCase);
        detailEndCase.setTEndConf(tEndConf);
        detailEndCase.setTEndSteps(tEndStepsList);
        return detailEndCase;
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateCaseConf(long caseId) {

    }

    @Transactional(rollbackFor = Exception.class)
    public void updateCaseStep(long caseId, double orderNo) {

    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCase(long caseId) {

    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCaseStep(long caseId, double orderNo) {

    }

    public TEndCase getDetailCase(long caseId) {
        return null;
    }
}
