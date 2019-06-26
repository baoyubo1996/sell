package com.imooc.service;

import com.imooc.dto.OrderDTO;
/**
 * @Author bao_ybo
 * @Description //TODO 消息推送
 * @Date 23:21 2019/6/26
 * @Param 
 * @return 
 **/
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
