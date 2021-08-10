package com.example.demo.service.impl;

import com.example.demo.annotation.LogMessage;
import com.example.demo.dto.TaskDTO;
import com.example.demo.mappers.TestcaseMapper;
import com.example.demo.model.Testcase;
import com.example.demo.service.ApiAotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zw.wen
 */
@Service
@Slf4j
public class ApiAotServiceImpl implements ApiAotService {
    @Autowired
    TestcaseMapper testcaseMapper;

    public List<Testcase> queryList(){
        List<Testcase> testcaseList = testcaseMapper.selectByExample(null);
        for(Testcase t:testcaseList) {
            log.info("" + t);
        }
        return testcaseList;
    }


    @Override
    @LogMessage
    public void runCase(TaskDTO taskDTO) {


    }

    public void cancellCase(String taskId){

    }
}
