package com.zrblog.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 09:19
 * @Version:v1.0
 */
@ConfigurationProperties(prefix = "my")
@Component
public class ConfigBean {

    private String name;
    private Integer age;
    private Integer number;
    private String uuid;
    private Integer max;
    private String greeting;
    private String value;

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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public java.lang.String toString() {
        return "ConfigBean{" +
                "name=" + name +
                ", age=" + age +
                ", number=" + number +
                ", uuid=" + uuid +
                ", max=" + max +
                ", greeting=" + greeting +
                ", value=" + value +
                '}';
    }
}
