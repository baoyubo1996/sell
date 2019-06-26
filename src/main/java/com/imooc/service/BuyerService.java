package com.imooc.service;

import com.imooc.dto.OrderDTO;
/**
 * @ClassName BuyerService
 * @Description TODO
 * @Auther bao_ybo
 * @Date 2019/6/26 23:43
 * @Version 1.0
 **/
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
