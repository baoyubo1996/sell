package com.imooc.enums;

import lombok.Getter;

/*
 * @Author bao_ybo
 * @Description //TODO
 * @Date 10:27 2019/6/25
 * @Param
 * @return
 **/
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
