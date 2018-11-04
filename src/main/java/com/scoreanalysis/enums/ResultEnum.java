package com.scoreanalysis.enums;

/**
 * @EnumName ResultEnum
 * @Author yang_
 * @Description 请求接口的枚举信息
 * @Date 2018/11/4 18:04
 */
public enum  ResultEnum {
    UNKNOW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    FAIL(1,"失败"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg){
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
