package com.scoreanalysis.controller;

import com.scoreanalysis.bean.Student;
import com.scoreanalysis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Author yang_
 * @Description
 * @Date 2018/11/5 13:03
 */
@RestController
public class TestController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    public Student getStudentById(@RequestParam("id") String id){
        return studentService.getStudentById(id);
    }
}
