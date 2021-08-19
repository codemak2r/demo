package com.example.demo.mappers;

import com.example.demo.model.TAfterExecCase;
import com.example.demo.model.TAfterExecCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAfterExecCaseMapper {
    long countByExample(TAfterExecCaseExample example);

    int deleteByExample(TAfterExecCaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TAfterExecCase record);

    int insertSelective(TAfterExecCase record);

    TAfterExecCase selectOneByExample(TAfterExecCaseExample example);

    List<TAfterExecCase> selectByExample(TAfterExecCaseExample example);

    TAfterExecCase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TAfterExecCase record, @Param("example") TAfterExecCaseExample example);

    int updateByExample(@Param("record") TAfterExecCase record, @Param("example") TAfterExecCaseExample example);

    int updateByPrimaryKeySelective(TAfterExecCase record);

    int updateByPrimaryKey(TAfterExecCase record);

    int batchInsert(@Param("list") List<TAfterExecCase> list);

    int batchInsertSelective(@Param("list") List<TAfterExecCase> list, @Param("selective") TAfterExecCase.Column ... selective);
}