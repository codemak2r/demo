package com.example.demo.mappers;

import com.example.demo.model.TAfterExecCases;
import com.example.demo.model.TAfterExecCasesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAfterExecCasesMapper {
    long countByExample(TAfterExecCasesExample example);

    int deleteByExample(TAfterExecCasesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TAfterExecCases record);

    int insertSelective(TAfterExecCases record);

    TAfterExecCases selectOneByExample(TAfterExecCasesExample example);

    List<TAfterExecCases> selectByExample(TAfterExecCasesExample example);

    TAfterExecCases selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TAfterExecCases record, @Param("example") TAfterExecCasesExample example);

    int updateByExample(@Param("record") TAfterExecCases record, @Param("example") TAfterExecCasesExample example);

    int updateByPrimaryKeySelective(TAfterExecCases record);

    int updateByPrimaryKey(TAfterExecCases record);

    int batchInsert(@Param("list") List<TAfterExecCases> list);

    int batchInsertSelective(@Param("list") List<TAfterExecCases> list, @Param("selective") TAfterExecCases.Column ... selective);
}