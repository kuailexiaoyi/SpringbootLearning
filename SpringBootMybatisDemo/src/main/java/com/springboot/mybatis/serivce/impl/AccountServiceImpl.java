package com.springboot.mybatis.serivce.impl;

import com.springboot.mybatis.dao.AccountMapper;
import com.springboot.mybatis.domain.Account;
import com.springboot.mybatis.serivce.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Integer insertAccount(String name, Double money) {

        return accountMapper.insertAccount(name,money);
    }

    @Override
    public Integer deleteAccount(Integer id) {
        return accountMapper.deleteAccount(id);
    }

    @Override
    public Account selectAccount(Integer id) {
        return accountMapper.selectAccount(id);
    }

    @Override
    public List<Account> selectAllAccount() {
        return accountMapper.selectAllAccount();
    }

    @Override
    public Integer updateAccount(Integer id, String name, Double money) {
        return accountMapper.updateAccount(id,name,money);
    }
}
