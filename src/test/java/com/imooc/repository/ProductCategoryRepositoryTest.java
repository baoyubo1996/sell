package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
/**
 * @Author bao_ybo
 * @Description //TODO
 * @Date 17:34 2019/6/24
 * @Param 
 * @return 
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest  {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findById(1).orElse(null);
        System.out.println(productCategory.toString());
    }
    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(3);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }
   @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(1,2,3);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
       Assert.assertNotEquals(0,result.size());
   }

}