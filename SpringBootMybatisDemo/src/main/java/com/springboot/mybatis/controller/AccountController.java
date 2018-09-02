package com.springboot.mybatis.controller;

import com.springboot.mybatis.domain.Account;
import com.springboot.mybatis.serivce.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-02 10:08
 * @Version:v1.0
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Account> selectAllAccount(){
        return accountService.selectAllAccount();
    }
}
