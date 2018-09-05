package com.springboot.translation.dao;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    Integer updateAccount(@Param("id") Integer id, @Param("name") String name, @Param("money") Double money);

}
