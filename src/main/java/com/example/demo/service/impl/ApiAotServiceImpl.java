package com.example.demo.service.impl;

import com.example.demo.aop.annotation.LogMessage;
import com.example.demo.dto.TaskDTO;
import com.example.demo.mappers.TestcaseMapper;
import com.example.demo.model.Testcase;
import com.example.demo.service.ApiAotService;
import com.example.demo.service.WebSocketService;
import com.example.demo.task.TaskFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

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
        log.info("0:" + testcaseList.get(0));
        return testcaseList;
    }


    @Override
    @LogMessage
    public void runCase(TaskDTO taskDTO) {


    }

    public void cancellCase(String taskId){

    }
}
