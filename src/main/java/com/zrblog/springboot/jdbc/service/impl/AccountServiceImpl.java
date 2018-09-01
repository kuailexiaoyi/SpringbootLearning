package com.zrblog.springboot.jdbc.service.impl;

import com.zrblog.springboot.jdbc.bean.Account;
import com.zrblog.springboot.jdbc.dao.IAccountDao;
import com.zrblog.springboot.jdbc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 11:46
 * @Version:v1.0
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public int add(Account account) {
        return accountDao.add(account);
    }

    @Override
    public Integer delete(Account account) {
        return accountDao.delete(account);
    }

    @Override
    public Account queryAccountById(Integer id) {
        return accountDao.queryAccountById(id);
    }

    @Override
    public List<Account> queryAllAccount() {
        return accountDao.queryAllAccount();
    }
}
