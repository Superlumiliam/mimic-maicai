package com.atxzl.mc.common.exception;


import com.atxzl.mc.common.result.ResultCodeEnum;

public class McException  extends RuntimeException{
    private Integer code;

    public McException(String message, Integer code){
        super(message);
        this.code = code;
    }
    public McException(ResultCodeEnum resultCodeEnum){
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }
}
