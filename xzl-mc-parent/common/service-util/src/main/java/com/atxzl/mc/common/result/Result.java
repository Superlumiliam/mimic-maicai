package com.atxzl.mc.common.result;

import lombok.Data;

@Data
public class Result<T> {

    //status code
    private Integer code;

    //message
    private String message;

    //data
    private T data;

    private Result(){ }

    //
    public static<T> Result<T> build(T data, ResultCodeEnum resultCodeEnum){
        Result<T> result = new Result<>();
        //if response need data
        if(data != null ){
            result.setData(data);
        }
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    public static<T> Result<T> ok(T data){
        Result<T> result = build(data, ResultCodeEnum.SUCCESS);
        return result;
    }
    public static<T> Result<T> fail(T data){
        Result<T> result = build(data, ResultCodeEnum.FAIL);
        return result;
    }
}
