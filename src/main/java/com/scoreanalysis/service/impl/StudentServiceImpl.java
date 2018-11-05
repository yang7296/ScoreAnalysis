package com.scoreanalysis.service.impl;

import com.scoreanalysis.bean.Student;
import com.scoreanalysis.dao.StudentMapper;
import com.scoreanalysis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName StudentServiceImpl
 * @Author yang_
 * @Description
 * @Date 2018/11/5 13:00
 */
@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(String id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
