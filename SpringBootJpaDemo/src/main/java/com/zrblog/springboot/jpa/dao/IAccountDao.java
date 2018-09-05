package com.zrblog.springboot.jpa.dao;

import com.zrblog.springboot.jpa.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-01 17:01
 * @Version:v1.0
 */
public interface IAccountDao extends JpaRepository<Account,Integer>{


}
