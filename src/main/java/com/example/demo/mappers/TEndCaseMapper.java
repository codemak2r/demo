package com.example.demo.mappers;

import com.example.demo.model.TEndCase;
import com.example.demo.model.TEndCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEndCaseMapper {
    long countByExample(TEndCaseExample example);

    int deleteByExample(TEndCaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TEndCase record);

    int insertSelective(TEndCase record);

    TEndCase selectOneByExample(TEndCaseExample example);

    List<TEndCase> selectByExample(TEndCaseExample example);

    TEndCase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TEndCase record, @Param("example") TEndCaseExample example);

    int updateByExample(@Param("record") TEndCase record, @Param("example") TEndCaseExample example);

    int updateByPrimaryKeySelective(TEndCase record);

    int updateByPrimaryKey(TEndCase record);

    int batchInsert(@Param("list") List<TEndCase> list);

    int batchInsertSelective(@Param("list") List<TEndCase> list, @Param("selective") TEndCase.Column ... selective);
}