package com.atxzl.mc.common.exception;

import com.atxzl.mc.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// AOP Process
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();;
        return Result.fail(null);
    }

    @ExceptionHandler(McException.class)
    @ResponseBody
    public Result error(McException e){
        e.printStackTrace();;
        return Result.fail(null);
    }
}
