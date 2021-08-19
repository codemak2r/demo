package com.example.demo.mappers;

import com.example.demo.model.TEndReports;
import com.example.demo.model.TEndReportsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEndReportsMapper {
    long countByExample(TEndReportsExample example);

    int deleteByExample(TEndReportsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TEndReports record);

    int insertSelective(TEndReports record);

    TEndReports selectOneByExample(TEndReportsExample example);

    List<TEndReports> selectByExample(TEndReportsExample example);

    TEndReports selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TEndReports record, @Param("example") TEndReportsExample example);

    int updateByExample(@Param("record") TEndReports record, @Param("example") TEndReportsExample example);

    int updateByPrimaryKeySelective(TEndReports record);

    int updateByPrimaryKey(TEndReports record);

    int batchInsert(@Param("list") List<TEndReports> list);

    int batchInsertSelective(@Param("list") List<TEndReports> list, @Param("selective") TEndReports.Column ... selective);
}