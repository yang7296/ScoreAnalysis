package com.scoreanalysis.controller;

import com.scoreanalysis.enums.ResultEnum;
import com.scoreanalysis.util.BaseResponse;

/**
 * @ClassName BaseController
 * @Author yang_
 * @Description 基础Controller,所有的Controller都需要继承该Controller
 * @Date 2018/11/4 18:09
 */
public class BaseController {

    public BaseResponse ajaxSucc(Object data, ResultEnum resultEnum){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(resultEnum.getCode());
        baseResponse.setMsg(resultEnum.getMsg());
        baseResponse.setData(data);
        return  baseResponse;
    }

    public BaseResponse ajaxFail(ResultEnum resultEnum){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(resultEnum.getCode());
        baseResponse.setMsg(resultEnum.getMsg());
        return  baseResponse;
    }
}
