package com.store.lucky.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: linzj
 * date: 2019/3/11
 * time: 16:38
 * description: No Description
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/test")
public class TestBootController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello world";
    }
}
