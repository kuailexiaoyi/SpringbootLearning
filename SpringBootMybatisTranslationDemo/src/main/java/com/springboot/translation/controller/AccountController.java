package com.springboot.translation.controller;

import com.springboot.translation.domain.Account;
import com.springboot.translation.serivce.IAccountService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-02 19:59
 * @Version:v1.0
 */
@RestController
@RequestMapping("/account")
@MapperScan("com.springboot.translation.dao")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Account> selectAllAccount(){
        List<Account> accounts = accountService.selectAllAccount();
        return accounts;
    }

    @RequestMapping("/query/{id}")
    @ResponseBody
    public Account selectAccountById(@PathVariable("id")Integer id){
        Account accounts = accountService.selectAccountById(id);
        return accounts;
    }

    @RequestMapping("/update/{id}")
    public Integer updateAccount(@PathVariable("id")Integer id, @RequestParam("name")String name){
        Integer accounts = accountService.updateAccount(id,name,2.0);
        return accounts;
    }
}
