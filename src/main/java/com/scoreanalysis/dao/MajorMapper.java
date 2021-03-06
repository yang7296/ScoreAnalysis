package com.scoreanalysis.dao;

import java.util.List;

import com.scoreanalysis.bean.Major;
import com.scoreanalysis.bean.MajorExample;
import org.apache.ibatis.annotations.Param;

public interface MajorMapper {
    long countByExample(MajorExample example);

    int deleteByExample(MajorExample example);

    int deleteByPrimaryKey(String mid);

    int insert(Major record);

    int insertSelective(Major record);

    List<Major> selectByExample(MajorExample example);

    Major selectByPrimaryKey(String mid);

    int updateByExampleSelective(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByExample(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}