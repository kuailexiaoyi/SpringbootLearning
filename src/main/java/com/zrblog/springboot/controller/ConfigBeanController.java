package com.zrblog.springboot.controller;

import com.zrblog.springboot.bean.ConfigBean;
import com.zrblog.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: ${Description}
 * @Author: zrblog
 * @CreateTime: 2018-09-01 00:56
 * @Version:v1.0
 */
@RestController
@EnableConfigurationProperties(ConfigBean.class)
public class ConfigBeanController {

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private User user;

    @RequestMapping("/config")
    public String index(){
        return configBean.toString();
    }

    @RequestMapping("/user")
    public String readUser(){
        return user.toString();
    }
}
