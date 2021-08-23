package com.example.demo.mappers;

import com.example.demo.model.TEndCases;
import com.example.demo.model.TEndCasesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEndCasesMapper {
    long countByExample(TEndCasesExample example);

    int deleteByExample(TEndCasesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TEndCases record);

    int insertSelective(TEndCases record);

    TEndCases selectOneByExample(TEndCasesExample example);

    List<TEndCases> selectByExample(TEndCasesExample example);

    TEndCases selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TEndCases record, @Param("example") TEndCasesExample example);

    int updateByExample(@Param("record") TEndCases record, @Param("example") TEndCasesExample example);

    int updateByPrimaryKeySelective(TEndCases record);

    int updateByPrimaryKey(TEndCases record);

    int batchInsert(@Param("list") List<TEndCases> list);

    int batchInsertSelective(@Param("list") List<TEndCases> list, @Param("selective") TEndCases.Column ... selective);
}