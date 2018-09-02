package com.springboot.translation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-02 19:44
 * @Version:v1.0
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/hello")
    public String getHello(){
        return "Hello World";
    }
}
