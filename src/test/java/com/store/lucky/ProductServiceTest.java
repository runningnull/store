package com.store.lucky;

import com.store.lucky.product.model.Product;
import com.store.lucky.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;

/**
 * @author: linzj
 * date: 2019/3/14
 * time: 11:11
 * description: No Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void insert() {
        Product product = new Product();
        product.setSellOut(0);
        product.setProductName("面包");
        product.setRemainder(10);
        product.setProductCode("6666");
        boolean result = productService.insertSelective(product);
        Assert.assertThat(result, is(true));
    }
}
