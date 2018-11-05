package com.scoreanalysis.dao;

import java.util.List;

import com.scoreanalysis.bean.StuCourse;
import com.scoreanalysis.bean.StuCourseExample;
import org.apache.ibatis.annotations.Param;

public interface StuCourseMapper {
    long countByExample(StuCourseExample example);

    int deleteByExample(StuCourseExample example);

    int insert(StuCourse record);

    int insertSelective(StuCourse record);

    List<StuCourse> selectByExample(StuCourseExample example);

    int updateByExampleSelective(@Param("record") StuCourse record, @Param("example") StuCourseExample example);

    int updateByExample(@Param("record") StuCourse record, @Param("example") StuCourseExample example);
}