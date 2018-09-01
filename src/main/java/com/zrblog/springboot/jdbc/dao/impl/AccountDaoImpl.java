package com.zrblog.springboot.jdbc.dao.impl;

import com.zrblog.springboot.jdbc.bean.Account;
import com.zrblog.springboot.jdbc.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.alibaba.druid.sql.parser.Token.INTO;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 11:27
 * @Version:v1.0
 */
@Repository
public class AccountDaoImpl implements IAccountDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        int num = jdbcTemplate.update("INSERT INTO account(name,money) VALUES (?,?)", account.getName(), account.getMoney());
        return num;
    }

    @Override
    public Integer delete(Account account) {
        int num = jdbcTemplate.update("DELETE FROM account WHERE id = ?",account.getId());
        return num;
    }

    @Override
    public Account queryAccountById(Integer id) {
        List<Account> accountList = jdbcTemplate.query("SELECT * FROM account WHERE id = ?",new Object[]{id},new BeanPropertyRowMapper(Account.class));
        Account account = null;
        if (! accountList.isEmpty()){
            account = accountList.get(0);
        }
        return account;
    }

    @Override
    public List<Account> queryAllAccount() {
        List<Account> accountList = jdbcTemplate.query("SELECT * FROM account",new Object[]{},new BeanPropertyRowMapper(Account.class));
        return accountList;
    }
}
