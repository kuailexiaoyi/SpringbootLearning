package com.zrblog.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: ${Description}
 * @Author: zrblog
 * @CreateTime: 2018-09-01 00:56
 * @Version:v1.0
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index(){
        return "Hello World,Greeting from Spring Boot";
    }
}
