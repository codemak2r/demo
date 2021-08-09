package com.example.demo.mappers;

import com.example.demo.model.SelfVar;
import com.example.demo.model.SelfVarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelfVarMapper {
    long countByExample(SelfVarExample example);

    int deleteByExample(SelfVarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SelfVar record);

    int insertSelective(SelfVar record);

    List<SelfVar> selectByExample(SelfVarExample example);

    SelfVar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SelfVar record, @Param("example") SelfVarExample example);

    int updateByExample(@Param("record") SelfVar record, @Param("example") SelfVarExample example);

    int updateByPrimaryKeySelective(SelfVar record);

    int updateByPrimaryKey(SelfVar record);
}