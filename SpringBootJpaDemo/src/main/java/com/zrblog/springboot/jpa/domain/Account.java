package com.zrblog.springboot.jpa.domain;

import com.sun.org.apache.xpath.internal.operations.String;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 17:01
 * @Version:v1.0
 */
@Entity
public class Account {

    @Id
    @GeneratedValue
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
