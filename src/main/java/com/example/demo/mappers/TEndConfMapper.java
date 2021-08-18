package com.example.demo.mappers;

import com.example.demo.model.TEndConf;
import com.example.demo.model.TEndConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEndConfMapper {
    long countByExample(TEndConfExample example);

    int deleteByExample(TEndConfExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TEndConf record);

    int insertSelective(TEndConf record);

    TEndConf selectOneByExample(TEndConfExample example);

    List<TEndConf> selectByExample(TEndConfExample example);

    TEndConf selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TEndConf record, @Param("example") TEndConfExample example);

    int updateByExample(@Param("record") TEndConf record, @Param("example") TEndConfExample example);

    int updateByPrimaryKeySelective(TEndConf record);

    int updateByPrimaryKey(TEndConf record);

    int batchInsert(@Param("list") List<TEndConf> list);

    int batchInsertSelective(@Param("list") List<TEndConf> list, @Param("selective") TEndConf.Column ... selective);
}