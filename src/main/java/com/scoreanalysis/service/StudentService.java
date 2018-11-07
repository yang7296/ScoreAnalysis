package com.scoreanalysis.service;


import com.scoreanalysis.bean.Student;
import com.scoreanalysis.pojo.StudentExtend;

import java.util.List;

public interface StudentService {
    Student getStudentById(String id);

    int addStudent(Student student);

    int deleteStudent(String id);

    List<StudentExtend> getStudents();

    String getStudentPlanId(String sId);
}
