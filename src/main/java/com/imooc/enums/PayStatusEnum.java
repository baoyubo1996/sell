package com.imooc.enums;

import lombok.Getter;

/**
 * @Author bao_ybo
 * @Description //TODO
 * @Date 21:28 2019/6/25
 * @Param
 * @return 
 **/
@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
