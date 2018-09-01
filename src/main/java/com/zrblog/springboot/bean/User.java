package com.zrblog.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 09:32
 * @Version:v1.0
 */
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.zrblog")
@Configuration
public class User {
    private String name;
    private Integer age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public java.lang.String toString() {
        return "User{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
