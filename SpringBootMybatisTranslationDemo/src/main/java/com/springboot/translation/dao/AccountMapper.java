package com.springboot.translation.dao;

import com.springboot.translation.domain.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {

    Integer updateAccount(@Param("id") Integer id, @Param("name") String name, @Param("money") Double money);

    List<Account> selectAllAccount();

    Account selectAccountById(@Param("id") Integer id);
}
