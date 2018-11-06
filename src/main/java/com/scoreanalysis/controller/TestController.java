package com.scoreanalysis.controller;

import com.scoreanalysis.bean.Student;
import com.scoreanalysis.enums.ResultEnum;
import com.scoreanalysis.service.StudentService;
import com.scoreanalysis.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestController
 * @Author yang_
 * @Description
 * @Date 2018/11/5 13:03
 */
@RestController
public class TestController extends BaseController{

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student/{id}")
    public BaseResponse getStudentById(@PathVariable("id") String id){
        Student student = studentService.getStudentById(id);
        if (student != null){
            return ajaxSucc(student, ResultEnum.SUCCESS);
        }
        return ajaxFail(ResultEnum.FAIL);
    }

    // 定义一个API接口
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST) // 指定为POST方式，地址为/ScoreAnalysis/addStudent
    //@PostMapping(value = "/addStudent") 或者用这种方式
    public BaseResponse addStudent(Student student){
        int result = studentService.addStudent(student);
        //如果已经存在了  就ajaxFail
        if (result > 0){
            // 成功
            return ajaxSucc(null,ResultEnum.SUCCESS);
        }else {
            return ajaxFail(ResultEnum.FAIL);
        }
    }

    @RequestMapping(value = "/deleteStudent/{id}")
    public BaseResponse deleteStudent(@PathVariable("id") String id){
        int result = studentService.deleteStudent(id);
        if(result > 0){
            //成功
            return ajaxSucc(null,ResultEnum.SUCCESS);
        }else{
            return ajaxFail(ResultEnum.FAIL);

        }
    }
}
