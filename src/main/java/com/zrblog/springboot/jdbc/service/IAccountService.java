package com.zrblog.springboot.jdbc.service;

import com.zrblog.springboot.jdbc.bean.Account;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 11:46
 * @Version:v1.0
 */
public interface IAccountService {
    int add(Account account);

    Integer delete(Account account);

    Account queryAccountById(Integer id);

    List<Account> queryAllAccount();
}
