package com.springboot.mongodb.domain;

import org.springframework.data.annotation.Id;


/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-02 23:42
 * @Version:v1.0
 */
public class Customer {
    @Id
    private String id;

    private String firstName;

    private String lastName;

    public Customer(){

    }

    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public java.lang.String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstname=" + firstName +
                ", lastname=" + lastName +
                '}';
    }
}
