package com.zrblog.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: ${Description}
 * @Author: zrblog
 * @CreateTime: 2018-09-01 00:56
 * @Version:v1.0
 */
@RestController
public class ReadConfiurationFileController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private Integer age;

    @RequestMapping("/readconfiguration")
    public String readConfigurationProperties(){
        return "name:" + name + ";age:" + age;
    }
}
