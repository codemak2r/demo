package com.example.demo.database;

import com.example.demo.mappers.TEndCaseMapper;
import com.example.demo.mappers.TEndConfMapper;
import com.example.demo.mappers.TEndStepsMapper;
import com.example.demo.model.TEndCase;
import com.example.demo.model.TEndConf;
import com.example.demo.model.TEndSteps;
import com.example.demo.service.EndService;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author: zw.wen
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MybatisTest {
    @Resource
    TEndCaseMapper tEndCaseMapper;

    @Resource
    TEndConfMapper tEndConfMapper;

    @Resource
    TEndStepsMapper tEndStepsMapper;

    @Resource
    EndService endService;

    @Test
    public void testService(){
        try {
            endService.runCase(1L);
            Thread.sleep(200000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void test() {
        TEndCase tEndCase = new TEndCase();
        TEndConf tEndConf = new TEndConf();
        TEndSteps tEndSteps = new TEndSteps();

        tEndCase.setId(1L);
        tEndCase.setName("baidu");
        tEndCase.setDesc("测试");
        tEndCase.setOwner("jack");
        tEndCase.setCreateTime(new Date());
        tEndCaseMapper.insert(tEndCase);

        tEndConf.setTestUrl("https://www.baidu.com");
        tEndConf.setBrowser(1);
        tEndConf.setTCaseId(1L);
        tEndConfMapper.insert(tEndConf);

        tEndSteps.setTCaseId(1L);
        tEndSteps.setAction("click");
        tEndSteps.setElementType("id");
        tEndSteps.setElement("s-top-loginbtn");
        tEndStepsMapper.insert(tEndSteps);

        tEndSteps = new TEndSteps();
        tEndSteps.setTCaseId(1L);
        tEndSteps.setAction("pause");
        tEndStepsMapper.insert(tEndSteps);

        tEndSteps = new TEndSteps();
        tEndSteps.setTCaseId(1L);
        tEndSteps.setAction("click");
        tEndSteps.setElementType("id");
        tEndSteps.setElement("TANGRAM__PSP_11__footerULoginBtn");
        tEndStepsMapper.insert(tEndSteps);

        tEndSteps = new TEndSteps();
        tEndSteps.setTCaseId(1L);
        tEndSteps.setAction("click");
        tEndSteps.setElementType("id");
        tEndSteps.setElement("TANGRAM__PSP_11__userName");
        tEndSteps.setVal("a403481704@sina.cn");
        tEndStepsMapper.insert(tEndSteps);

        tEndSteps = new TEndSteps();
        tEndSteps.setTCaseId(1L);
        tEndSteps.setAction("click");
        tEndSteps.setElementType("id");
        tEndSteps.setElement("TANGRAM__PSP_11__password");
        tEndSteps.setVal("a403481704");
        tEndStepsMapper.insert(tEndSteps);

        tEndSteps = new TEndSteps();
        tEndSteps.setTCaseId(1L);
        tEndSteps.setAction("click");
        tEndSteps.setElementType("id");
        tEndSteps.setElement("TANGRAM__PSP_11__submit");
        tEndStepsMapper.insert(tEndSteps);
    }


}
