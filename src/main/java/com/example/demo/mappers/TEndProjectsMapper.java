package com.example.demo.mappers;

import com.example.demo.model.TEndProjects;
import com.example.demo.model.TEndProjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEndProjectsMapper {
    long countByExample(TEndProjectsExample example);

    int deleteByExample(TEndProjectsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TEndProjects record);

    int insertSelective(TEndProjects record);

    TEndProjects selectOneByExample(TEndProjectsExample example);

    List<TEndProjects> selectByExample(TEndProjectsExample example);

    TEndProjects selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TEndProjects record, @Param("example") TEndProjectsExample example);

    int updateByExample(@Param("record") TEndProjects record, @Param("example") TEndProjectsExample example);

    int updateByPrimaryKeySelective(TEndProjects record);

    int updateByPrimaryKey(TEndProjects record);

    int batchInsert(@Param("list") List<TEndProjects> list);

    int batchInsertSelective(@Param("list") List<TEndProjects> list, @Param("selective") TEndProjects.Column ... selective);
}