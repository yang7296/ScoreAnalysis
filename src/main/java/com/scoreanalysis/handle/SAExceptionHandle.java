package com.scoreanalysis.handle;

import com.scoreanalysis.exception.SAException;
import com.scoreanalysis.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName SAExceptionHandle
 * @Author yang_
 * @Description "ScoreAnalysis" 系统运行异常处理
 * @Date 2018/11/4 18:37
 */
@ControllerAdvice
public class SAExceptionHandle {

    private static final Logger logger = LoggerFactory.getLogger(SAExceptionHandle.class);
    @ExceptionHandler
    public BaseResponse SAExceptionHandler(Exception e){
        logger.error("拦截异常");
        if (e instanceof SAException){
            // 系统自定义的异常
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setCode(((SAException) e).getCode());
            baseResponse.setMsg(((SAException) e).getMsg());
            return baseResponse;
        }else{
            // 其他异常
            return  null;
        }
    }
}
