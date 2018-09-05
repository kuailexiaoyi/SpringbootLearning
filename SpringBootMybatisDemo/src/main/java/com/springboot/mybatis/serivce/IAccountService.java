package com.springboot.mybatis.serivce;

import com.springboot.mybatis.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-02 10:04
 * @Version:v1.0
 */
public interface IAccountService {
    Integer insertAccount(String name, Double money);

    Integer deleteAccount(Integer id);

    Account selectAccount(Integer id);

    List<Account> selectAllAccount();
}
