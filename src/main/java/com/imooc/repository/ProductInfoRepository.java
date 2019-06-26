package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * @Author bao_ybo
 * @Description //TODO
 * @Date 10:37 2019/6/25
 * @Param 
 * @return
 **/
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}

