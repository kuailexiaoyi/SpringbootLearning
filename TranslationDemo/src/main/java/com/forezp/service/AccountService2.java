package com.forezp.service;

import com.forezp.dao.AccountMapper2;
import com.forezp.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fangzhipeng on 2017/4/20.
 */
@Service
public class AccountService2 {

    @Autowired
    AccountMapper2 accountMapper2;

    @Transactional
    public List<Account> transfer() throws RuntimeException{
        return accountMapper2.select();
    }
}
