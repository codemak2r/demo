package com.example.demo.service;
import java.util.Date;


import com.example.demo.dto.TEndCaseDetails;
import com.example.demo.mappers.TEndCaseMapper;
import com.example.demo.mappers.TEndConfMapper;
import com.example.demo.mappers.TEndStepsMapper;
import com.example.demo.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: zw.wen
 */
@Service
@Slf4j
public class EndService {
    @Autowired
    TEndCaseMapper tEndCaseMapper;

    @Autowired
    TEndConfMapper tEndConfMapper;

    @Autowired
    TEndStepsMapper tEndStepsMapper;


    @Cacheable(cacheNames = "cases")
    public List<TEndCase> getAllCases() {
        return tEndCaseMapper.selectByExample(null);
    }

    @Cacheable(cacheNames = "detailCase")
    public TEndCaseDetails getDetailCase(Long caseId) {
        TEndCase tEndCase = tEndCaseMapper.selectByPrimaryKey(caseId);
        TEndConfExample tEndConfExample = new TEndConfExample();
        tEndConfExample.createCriteria().andTCaseIdEqualTo(caseId);
        TEndConf tEndConf = tEndConfMapper.selectOneByExample(tEndConfExample);
        TEndStepsExample tEndStepsExample = new TEndStepsExample();
        tEndStepsExample.createCriteria().andTCaseIdEqualTo(caseId);
        List<TEndSteps> tEndSteps = tEndStepsMapper.selectByExample(tEndStepsExample);
        TEndCaseDetails tEndCaseDetails = new TEndCaseDetails();
        tEndCaseDetails.setTEndCase(tEndCase);
        tEndCaseDetails.setTEndConf(tEndConf);
        tEndCaseDetails.setTEndSteps(tEndSteps);
        return  tEndCaseDetails;
    }

    @CachePut(cacheNames = "detailCase")
    @Transactional(rollbackForClassName = "Exception.class")
    public void createCase(TEndCaseDetails tEndCaseDetails) {
        TEndCase tEndCase = new TEndCase();
        tEndCase.setName(tEndCaseDetails.getTEndCase().getName());
        tEndCase.setDesc(tEndCaseDetails.getTEndCase().getDesc());
        tEndCase.setOwner(tEndCaseDetails.getTEndCase().getOwner());
        tEndCase.setCreatedTime(new Date());
        tEndCase.setIsBefore(tEndCaseDetails.getTEndCase().getIsBefore());
        tEndCase.setIsAfter(tEndCaseDetails.getTEndCase().getIsAfter());

    }
}
