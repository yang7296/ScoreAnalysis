package com.scoreanalysis.service.impl;

import com.scoreanalysis.bean.Student;
import com.scoreanalysis.dao.StudentMapper;
import com.scoreanalysis.daoExtend.StudentExtendMapper;
import com.scoreanalysis.enums.ExceptionEnum;
import com.scoreanalysis.exception.SAException;
import com.scoreanalysis.pojo.StudentExtend;
import com.scoreanalysis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    private StudentExtendMapper studentExtendMapper;
    @Override
    public Student getStudentById(String id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addStudent(Student student) {
        if (studentMapper.selectByPrimaryKey(student.getSid()) != null){
            throw new SAException(ExceptionEnum.STUDENT_EXIST);
        }
        return studentMapper.insert(student);
    }

    @Override
    public int deleteStudent(String id) {
        if (studentMapper.selectByPrimaryKey(id) == null){
            throw new SAException(ExceptionEnum.STUDENT_NO_EXIST);
        }
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<StudentExtend> getStudents() {
        return studentExtendMapper.getStudents();
    }

    @Override
    public String getStudentPlanId(String sId) {
        String planId = studentExtendMapper.getStudentPlanId(sId);
        return planId;
    }

}
