package com.zrblog.springboot.jpa.service.impl;

import com.zrblog.springboot.jpa.dao.IAccountDao;
import com.zrblog.springboot.jpa.domain.Account;
import com.zrblog.springboot.jpa.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 22:06
 * @Version:v1.0
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public Account queryAccountById(Integer id) {
        Account result = accountDao.findOne(id);
        return result;
    }
}
