package com.springboot.mybatis.dao;

import com.fasterxml.jackson.core.sym.Name;
import com.springboot.mybatis.domain.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface  AccountMapper {

    @Insert("insert into account(id,name,money) values(#{name},#{money})")
    Integer insertAccount(@Param("name") String name, @Param("money") Double money);

    @Delete("delete from account where id = #{id}")
    Integer deleteAccount(@Param("id") Integer id);

    @Select("select * from account where id = #{id}")
    Account selectAccount(@Param("id") Integer id);

    @Select("select * from account")
    List<Account> selectAllAccount();

    @Update("update account set name = #{name},money = #{money} where id = #{id}")
    Integer updateAccount(@Param("id") Integer id,@Param("name") String name, @Param("money") Double money);

}
