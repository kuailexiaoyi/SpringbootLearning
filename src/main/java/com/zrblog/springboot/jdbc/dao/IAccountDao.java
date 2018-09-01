package com.zrblog.springboot.jdbc.dao;

import com.zrblog.springboot.jdbc.bean.Account;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 11:27
 * @Version:v1.0
 */
public interface IAccountDao {

    int add(Account account);

    Integer delete(Account account);

    Account queryAccountById(Integer id);

    List<Account>  queryAllAccount();

}
