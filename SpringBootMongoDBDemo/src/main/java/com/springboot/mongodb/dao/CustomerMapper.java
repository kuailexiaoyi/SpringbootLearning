package com.springboot.mongodb.dao;

import com.springboot.mongodb.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-02 23:50
 * @Version:v1.0
 */
public interface CustomerMapper extends MongoRepository<Customer,String> {

    public Customer findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
}
