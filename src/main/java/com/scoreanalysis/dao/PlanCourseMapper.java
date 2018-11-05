package com.scoreanalysis.dao;

import java.util.List;

import com.scoreanalysis.bean.PlanCourse;
import com.scoreanalysis.bean.PlanCourseExample;
import org.apache.ibatis.annotations.Param;

public interface PlanCourseMapper {
    long countByExample(PlanCourseExample example);

    int deleteByExample(PlanCourseExample example);

    int insert(PlanCourse record);

    int insertSelective(PlanCourse record);

    List<PlanCourse> selectByExample(PlanCourseExample example);

    int updateByExampleSelective(@Param("record") PlanCourse record, @Param("example") PlanCourseExample example);

    int updateByExample(@Param("record") PlanCourse record, @Param("example") PlanCourseExample example);
}