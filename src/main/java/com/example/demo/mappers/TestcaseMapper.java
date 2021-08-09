package com.example.demo.mappers;

import com.example.demo.model.Testcase;
import com.example.demo.model.TestcaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestcaseMapper {
    long countByExample(TestcaseExample example);

    int deleteByExample(TestcaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Testcase record);

    int insertSelective(Testcase record);

    List<Testcase> selectByExample(TestcaseExample example);

    Testcase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Testcase record, @Param("example") TestcaseExample example);

    int updateByExample(@Param("record") Testcase record, @Param("example") TestcaseExample example);

    int updateByPrimaryKeySelective(Testcase record);

    int updateByPrimaryKey(Testcase record);
}