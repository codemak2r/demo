package com.example.demo.service;

import com.example.demo.dto.EndConfParam;
import com.example.demo.dto.EndParams;
import com.example.demo.dto.EndStepsParams;
import com.example.demo.mappers.TEndCaseMapper;
import com.example.demo.mappers.TEndConfMapper;
import com.example.demo.mappers.TEndStepsMapper;
import com.example.demo.model.*;
import com.example.demo.utils.SeleniumUtil;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
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

    /**
     *
     * @param caseId
     * @throws Exception
     */

    @Async
    public void runCase(Long caseId) throws Exception {
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

        for(TEndSteps t : tEndSteps) {
            String action = t.getAction();
            String elementType = t.getElementType();
            String element = t.getElement();
            String value = t.getVal();
            seleniumUtil.invoke(action,elementType,element,value);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void createCase(EndParams endParams){

        String name = endParams.getName();
        String desc = endParams.getDesc();
        String creator = endParams.getCreator();
        String owner = endParams.getOwner();
        TEndCase tEndCase = new TEndCase();
        tEndCase.setName(name);
        tEndCase.setDesc(desc);
        tEndCase.setCreator(creator);
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
            tEndStepsMapper.insert(tEndSteps);
        }

    }

    @Transactional(rollbackFor = Exception.class)
    public void updateCaseConf(long caseId) {

    }

    @Transactional(rollbackFor = Exception.class)
    public void updateCaseStep(long caseId, double orderNo){

    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCase(long caseId) {

    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCaseStep(long caseId, double orderNo) {

    }
}
