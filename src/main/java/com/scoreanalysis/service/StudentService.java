package com.scoreanalysis.service;

import com.scoreanalysis.bean.Student;

public interface StudentService {
    Student getStudentById(String id);

    int addStudent(Student student);

    int deleteStudent(String id);
}
