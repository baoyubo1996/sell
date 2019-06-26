package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * @ClassName OrderDetailRepository
 * @Description TODO
 * @Auther bao_ybo
 * @Date 2019/6/25 21:51
 * @Version 1.0
 **/
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}
