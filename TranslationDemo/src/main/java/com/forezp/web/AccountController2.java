package com.forezp.web;

import com.forezp.entity.Account;
import com.forezp.service.AccountService2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by fangzhipeng on 2017/4/20.
 */
@RestController
@RequestMapping("/account")
@MapperScan("com.forezp.dao")
public class AccountController2 {
    @Autowired
    AccountService2 accountService;

    @RequestMapping(value = "transfer", method = RequestMethod.GET)
    @ResponseBody
    public List<Account> transfer(){
        return accountService.transfer();
    }
}
