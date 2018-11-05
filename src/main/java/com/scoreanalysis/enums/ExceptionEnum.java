package com.scoreanalysis.enums;

/**
 * @EnumName ExceptionEnum
 * @Description 异常信息的枚举接口
 * @author yang_
 * @Date 2018/11/4 18:32
 */
public enum ExceptionEnum {
    STUDENT_EXIST(101,"学生已经存在"),
    STUDENT_NO_EXIST(102,"学生不存在")
    ;

    private Integer code;

    private String msg;

    ExceptionEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
