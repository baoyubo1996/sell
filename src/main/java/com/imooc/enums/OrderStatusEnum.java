package com.imooc.enums;

import lombok.Getter;

/**
 * @Author bao_ybo
 * @Description //TODO
 * @Date 21:26 2019/6/25
 * @Param
 * @return
 **/
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;
    private String message;
    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
