package com.imooc.service;

import com.imooc.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
/**
 * @ClassName payService
 * @Description TODO
 * @Auther bao_ybo
 * @Date 2019/6/26 23:12
 * @Version 1.0
 **/
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}
