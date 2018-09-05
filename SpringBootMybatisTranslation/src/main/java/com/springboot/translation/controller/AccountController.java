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
    IAccountService accountService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Account> selectAllAccount(){
        return accountService.selectAllAccount();
    }

   /* @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> updateAccount(@PathVariable("id") Integer id){
        HashMap<String, Object> resultMap = new HashMap<>();
        Integer num = accountService.updateAccount(id, "Lisri", 25.0);
        if (num!=0){
            resultMap.put("code",200);
            resultMap.put("msg","update Account success,id:"+id);
        }else {
            resultMap.put("code",500);
            resultMap.put("msg","update Account fail,id:"+id);
        }
        return resultMap;
    }*/
}
