//package com.example.demo.database;
//
//import com.example.demo.mappers.TestcaseMapper;
//import com.example.demo.model.Testcase;
//import junit.framework.TestCase;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//
///**
// * @author: zw.wen
// */
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class MybatisTest {
//    @Resource
//    TestcaseMapper testcaseMapper;
//
//    @Test
//    void test() {
//        Testcase testcase = new Testcase();
//        testcase.setId(1L);
//        testcase.setName("工具测试");
//        testcase.setDesc("工具测试");
//        testcase.setCreator("wen");
//        testcase.setOwner("wen");
//        testcase.setStatus(1);
//        int result = testcaseMapper.insert(testcase);
//
//    }
//
//}
