package com.zrblog.springboot.jpa.controller;

import com.zrblog.springboot.jpa.dao.IAccountDao;
import com.zrblog.springboot.jpa.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 17:01
 * @Version:v1.0
 */
@RestController
@RequestMapping("/jpa")
public class AccountController {

    @Autowired
    IAccountDao accountDao;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> getAccounts() {
        return accountDao.findAll();
    }

}
