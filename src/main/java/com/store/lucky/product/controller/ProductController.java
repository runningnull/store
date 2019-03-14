package com.store.lucky.product.controller;

import com.store.lucky.product.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: linzj
 * date: 2019/3/14
 * time: 11:24
 * description: No Description
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/product")
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    
}
