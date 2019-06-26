package com.imooc.exception;

import com.imooc.enums.ResultEnum;
/**
 * @ClassName SellException
 * @Description TODO
 * @Auther bao_ybo
 * @Date 2019/6/25 10:49
 * @Version 1.0
 **/
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
