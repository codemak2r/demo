package com.example.demo.mappers;

import com.example.demo.model.TBeforeExecCase;
import com.example.demo.model.TBeforeExecCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBeforeExecCaseMapper {
    long countByExample(TBeforeExecCaseExample example);

    int deleteByExample(TBeforeExecCaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBeforeExecCase record);

    int insertSelective(TBeforeExecCase record);

    TBeforeExecCase selectOneByExample(TBeforeExecCaseExample example);

    List<TBeforeExecCase> selectByExample(TBeforeExecCaseExample example);

    TBeforeExecCase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBeforeExecCase record, @Param("example") TBeforeExecCaseExample example);

    int updateByExample(@Param("record") TBeforeExecCase record, @Param("example") TBeforeExecCaseExample example);

    int updateByPrimaryKeySelective(TBeforeExecCase record);

    int updateByPrimaryKey(TBeforeExecCase record);

    int batchInsert(@Param("list") List<TBeforeExecCase> list);

    int batchInsertSelective(@Param("list") List<TBeforeExecCase> list, @Param("selective") TBeforeExecCase.Column ... selective);
}