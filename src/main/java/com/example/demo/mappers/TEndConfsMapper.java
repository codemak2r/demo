package com.example.demo.mappers;

import com.example.demo.model.TEndConfs;
import com.example.demo.model.TEndConfsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEndConfsMapper {
    long countByExample(TEndConfsExample example);

    int deleteByExample(TEndConfsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TEndConfs record);

    int insertSelective(TEndConfs record);

    TEndConfs selectOneByExample(TEndConfsExample example);

    List<TEndConfs> selectByExample(TEndConfsExample example);

    TEndConfs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TEndConfs record, @Param("example") TEndConfsExample example);

    int updateByExample(@Param("record") TEndConfs record, @Param("example") TEndConfsExample example);

    int updateByPrimaryKeySelective(TEndConfs record);

    int updateByPrimaryKey(TEndConfs record);

    int batchInsert(@Param("list") List<TEndConfs> list);

    int batchInsertSelective(@Param("list") List<TEndConfs> list, @Param("selective") TEndConfs.Column ... selective);
}