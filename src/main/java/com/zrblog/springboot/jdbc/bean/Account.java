package com.zrblog.springboot.jdbc.bean;


/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 11:26
 * @Version:v1.0
 */
public class Account {
    private Integer id;

    private String name;

    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
