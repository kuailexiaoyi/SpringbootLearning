package com.zrblog.springboot.jpa.service;

import com.zrblog.springboot.jpa.domain.Account;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 17:01
 * @Version:v1.0
 */
public interface IAccountService{
    Account queryAccountById(Integer id);
}
