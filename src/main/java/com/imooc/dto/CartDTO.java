package com.imooc.dto;

import lombok.Data;

/**
 * @ClassName dto
 * @Description TODO
 * @Auther bao_ybo
 * @Date 2019/6/25 10:41
 * @Version 1.0
 **/
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

