package com.springboot.translation.serivce.impl;

import com.springboot.translation.dao.AccountMapper;
import com.springboot.translation.domain.Account;
import com.springboot.translation.serivce.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-02 10:05
 * @Version:v1.0
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    @Transactional
    public Integer updateAccount(Integer id, String name, Double money) {
        Integer result = accountMapper.updateAccount(id, name, money);
        Integer result1 = accountMapper.updateAccount(id+1, "zengrui", 5.6);
        return result1;
    }

    @Override
    public List<Account> selectAllAccount() {
        return accountMapper.selectAllAccount();
    }

    @Override
    public Account selectAccountById(Integer id) {
        return accountMapper.selectAccountById(id);
    }
}
