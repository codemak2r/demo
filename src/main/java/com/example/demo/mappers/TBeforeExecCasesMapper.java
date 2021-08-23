package com.example.demo.mappers;

import com.example.demo.model.TBeforeExecCases;
import com.example.demo.model.TBeforeExecCasesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBeforeExecCasesMapper {
    long countByExample(TBeforeExecCasesExample example);

    int deleteByExample(TBeforeExecCasesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBeforeExecCases record);

    int insertSelective(TBeforeExecCases record);

    TBeforeExecCases selectOneByExample(TBeforeExecCasesExample example);

    List<TBeforeExecCases> selectByExample(TBeforeExecCasesExample example);

    TBeforeExecCases selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBeforeExecCases record, @Param("example") TBeforeExecCasesExample example);

    int updateByExample(@Param("record") TBeforeExecCases record, @Param("example") TBeforeExecCasesExample example);

    int updateByPrimaryKeySelective(TBeforeExecCases record);

    int updateByPrimaryKey(TBeforeExecCases record);

    int batchInsert(@Param("list") List<TBeforeExecCases> list);

    int batchInsertSelective(@Param("list") List<TBeforeExecCases> list, @Param("selective") TBeforeExecCases.Column ... selective);
}