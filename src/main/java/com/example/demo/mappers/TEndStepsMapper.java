package com.example.demo.mappers;

import com.example.demo.model.TEndSteps;
import com.example.demo.model.TEndStepsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEndStepsMapper {
    long countByExample(TEndStepsExample example);

    int deleteByExample(TEndStepsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TEndSteps record);

    int insertSelective(TEndSteps record);

    TEndSteps selectOneByExample(TEndStepsExample example);

    List<TEndSteps> selectByExample(TEndStepsExample example);

    TEndSteps selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TEndSteps record, @Param("example") TEndStepsExample example);

    int updateByExample(@Param("record") TEndSteps record, @Param("example") TEndStepsExample example);

    int updateByPrimaryKeySelective(TEndSteps record);

    int updateByPrimaryKey(TEndSteps record);

    int batchInsert(@Param("list") List<TEndSteps> list);

    int batchInsertSelective(@Param("list") List<TEndSteps> list, @Param("selective") TEndSteps.Column ... selective);
}