package com.springboot.translation.serivce;

import com.springboot.translation.domain.Account;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-02 10:04
 * @Version:v1.0
 */
public interface IAccountService {
    Integer updateAccount(Integer id, String name, Double money);

    List<Account> selectAllAccount();

    Account selectAccountById(Integer id);
}
