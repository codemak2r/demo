package com.example.demo.services;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSONUtil;
import com.example.demo.dto.DetailsCaseForEnd;
import com.example.demo.model.TEndCases;
import com.example.demo.model.TEndProjects;
import com.example.demo.model.TEndSteps;
import com.google.common.collect.Lists;
import com.example.demo.model.TEndConfs;

import com.example.demo.dto.TEndCaseDetails;
import com.example.demo.service.EndService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @author: zw.wen
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class EndServiceTest {
    @Autowired
    EndService endService;

    @Test
    public void createProject(){
        TEndProjects tEndProjects = new TEndProjects();
        tEndProjects.setCreatedTime(new Date());
        tEndProjects.setOwner("John.Doe" + RandomUtil.randomString(1));
        tEndProjects.setDesc("测试project" + RandomUtil.randomString(2));
        tEndProjects.setName("测试项目" + RandomUtil.randomString(3));
        endService.createProject(tEndProjects);
    }

    @Test
    public void testCreateBeforeScript(){
        for(int i=0; i<20;i++){
            TEndCaseDetails tEndCaseDetails = new TEndCaseDetails();
            TEndCases tEndCases = new TEndCases();
            tEndCases.setCreatedTime(new Date());
            tEndCases.setOwner("John.Doe" + RandomUtil.randomString(3));
            tEndCases.setProjectId(1L);
            tEndCases.setName(RandomUtil.randomString(30));
            tEndCases.setDesc(RandomUtil.randomString(30));
            tEndCases.setStatus(0);
            tEndCases.setResult(0);
            tEndCases.setIsBefore(1);
            tEndCases.setIsAfter(0);

            TEndConfs tEndConfs = new TEndConfs();
            tEndConfs.setTestUrl("https://www.baidu.com");
            tEndConfs.setBrowser(1);
            tEndConfs.setIsHeadless(0);
            tEndCaseDetails.setTEndConfs(tEndConfs);
            tEndCaseDetails.setTEndCases(tEndCases);

            List<TEndSteps> tEndStepsList= new LinkedList<>();
            for(int j=0; j<50;j++){
                TEndSteps tEndSteps = new TEndSteps();
                tEndSteps.setAction("click");
                tEndSteps.setElementType("id");
                tEndSteps.setElement("//xpathid");
                tEndSteps.setOrderNo(65536.00*j);
                TEndSteps tEndSteps2 = new TEndSteps();
                tEndSteps2.setAction("send");
                tEndSteps2.setElementType("id");
                tEndSteps2.setElement("//xpathid");
                tEndSteps2.setOrderNo(655376.00*j*2);
                tEndSteps2.setVal("xxxx");
                tEndStepsList.add(tEndSteps);
                tEndStepsList.add(tEndSteps2);
            }
            tEndCaseDetails.setTEndSteps(tEndStepsList);
            endService.createCase(1L, tEndCaseDetails);
        }
    }

    @Test
    public void testCreateAfterScript(){
        for(int i=0; i<30;i++){
            TEndCaseDetails tEndCaseDetails = new TEndCaseDetails();
            TEndCases tEndCases = new TEndCases();
            tEndCases.setCreatedTime(new Date());
            tEndCases.setOwner("John.Doe" + RandomUtil.randomString(3));
            tEndCases.setProjectId(1L);
            tEndCases.setName(RandomUtil.randomString(30));
            tEndCases.setDesc(RandomUtil.randomString(30));
            tEndCases.setStatus(0);
            tEndCases.setResult(0);
            tEndCases.setIsBefore(0);
            tEndCases.setIsAfter(1);

            TEndConfs tEndConfs = new TEndConfs();
            tEndConfs.setTestUrl("https://www.baidu.com");
            tEndConfs.setBrowser(1);
            tEndConfs.setIsHeadless(0);
            tEndCaseDetails.setTEndConfs(tEndConfs);
            tEndCaseDetails.setTEndCases(tEndCases);

            List<TEndSteps> tEndStepsList= new LinkedList<>();
            for(int j=0; j<50;j++){
                TEndSteps tEndSteps = new TEndSteps();
                tEndSteps.setAction("click");
                tEndSteps.setElementType("id");
                tEndSteps.setElement("//xpathid");
                tEndSteps.setOrderNo(65536.00*j);
                TEndSteps tEndSteps2 = new TEndSteps();
                tEndSteps2.setAction("send");
                tEndSteps2.setElementType("id");
                tEndSteps2.setElement("//xpathid");
                tEndSteps2.setOrderNo(655376.00*j*2);
                tEndSteps2.setVal("xxxx");
                tEndStepsList.add(tEndSteps);
                tEndStepsList.add(tEndSteps2);
            }
            tEndCaseDetails.setTEndSteps(tEndStepsList);
            endService.createCase(1L, tEndCaseDetails);
        }
    }

    @Test
    public void testQueryAll(){
        log.info(JSONUtil.toJsonPrettyStr(endService.getAllCases(1L)));
    }
    @Test
    public void testRunCase(){
        endService.runCase(301L);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testCreateCase(){
        for(int x=0;x<1;x++) {
            double j = 65536;
            TEndCaseDetails tEndCaseDetails = new TEndCaseDetails();
            TEndCases tEndCases = new TEndCases();
            tEndCases.setCreatedTime(new Date());
            tEndCases.setOwner("John.Doe");
            tEndCases.setProjectId(1L);
            tEndCases.setName(RandomUtil.randomString(30));
            tEndCases.setDesc(RandomUtil.randomString(30));
            tEndCases.setStatus(0);
            tEndCases.setResult(0);
            tEndCases.setIsBefore(0);
            tEndCases.setIsAfter(0);

            tEndCaseDetails.setTEndCases(tEndCases);

            TEndConfs tEndConfs = new TEndConfs();
            tEndConfs.setTestUrl("https://www.baidu.com");
            tEndConfs.setBrowser(1);
            tEndConfs.setIsHeadless(0);
            tEndCaseDetails.setTEndConfs(tEndConfs);
            List<TEndSteps> tEndStepsList= new LinkedList<>();
            TEndSteps tEndSteps = new TEndSteps();
            tEndSteps.setAction("click");
            tEndSteps.setElementType("id");
            tEndSteps.setElement("s-top-loginbtn");
            tEndSteps.setOrderNo(65536.00*1);
            tEndStepsList.add(tEndSteps);

//            for(int i=0; i<50;i++){
//                TEndSteps tEndSteps = new TEndSteps();
//                tEndSteps.setAction("click");
//                tEndSteps.setElementType("id");
//                tEndSteps.setElement("s-top-loginbtn");
//                tEndSteps.setOrderNo(65536.00*i);
//                TEndSteps tEndSteps2 = new TEndSteps();
//                tEndSteps2.setAction("send");
//                tEndSteps2.setElementType("id");
//                tEndSteps2.setElement("//xpathid");
//                tEndSteps2.setOrderNo(655376.00*i*2);
//                tEndSteps2.setVal("xxxx");
//                tEndStepsList.add(tEndSteps);
//                tEndStepsList.add(tEndSteps2);
//            }
            tEndCaseDetails.setTEndSteps(tEndStepsList);
            Long[] before = {5L,6L,7L,8L,9L,10L};
            Long[] after = {25L,26L,27L,28L,29L,30L};
            tEndCaseDetails.setBeforeCases(Arrays.asList(before));
            tEndCaseDetails.setAfterCases(Arrays.asList(after));
            log.info(JSONUtil.toJsonPrettyStr(tEndCaseDetails));
            endService.createCase(1L, tEndCaseDetails);
        }
    }

    @Test
    public void testDeleteCase(){

    }
    @Test
    public void testQueryCase(){
        Long caseId = 282L;
        DetailsCaseForEnd detailsCaseForEnd = new DetailsCaseForEnd();
        detailsCaseForEnd.setTEndCases(endService.getBasicInfo(caseId));
        detailsCaseForEnd.setTEndConfs(endService.getConf(caseId));
        detailsCaseForEnd.setBeforeCases(endService.getAllBeforeCases(caseId));
        detailsCaseForEnd.setAfterCases(endService.getAllAfterCases(caseId));
        detailsCaseForEnd.setSteps(endService.getAllSteps(caseId));
        log.info(JSONUtil.toJsonPrettyStr(detailsCaseForEnd));
    }
    @Test
    public void testUpdateCase(){

    }
}
