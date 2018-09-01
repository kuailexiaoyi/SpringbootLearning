package com.zrblog.springboot.jdbc.controller;

import com.zrblog.springboot.jdbc.bean.Account;
import com.zrblog.springboot.jdbc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 11:50
 * @Version:v1.0
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    @ResponseBody
    public Account queryAccountById(@PathVariable("id") int id){
        Account account = accountService.queryAccountById(id);
        return account;
    }

    @RequestMapping(value = "/allAccount",method = RequestMethod.GET)
    @ResponseBody
    public List<Account> queryAllAccount(){
        List<Account> account = accountService.queryAllAccount();
        return account;
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> addAccount(@RequestParam(value = "id") Integer id, @RequestParam(value = "name")String name){
        Account account = new Account();
        account.setId(id);
        account.setName(name);
        account.setMoney(100.0);
        int num = accountService.add(account);
        Map<String,Object> resultMap = new HashMap<String,Object>();
        if (num!=0){
            resultMap.put("code",200);
            resultMap.put("status","add success");
        }else {
            resultMap.put("code",500);
            resultMap.put("status","add fail");
        }
        return resultMap;
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> deleteAccount(@PathVariable("id") Integer id){
        Account account = new Account();
        account.setId(id);
        int num = accountService.delete(account);
        Map<String,Object> resultMap = new HashMap<String,Object>();
        if (num!=0){
            resultMap.put("code",200);
            resultMap.put("status","delete success");
        }else {
            resultMap.put("code",500);
            resultMap.put("status","delete fail");
        }
        return resultMap;
    }
}
