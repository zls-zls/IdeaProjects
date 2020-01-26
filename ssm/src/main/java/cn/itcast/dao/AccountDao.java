package cn.itcast.dao;

import cn.itcast.domain.Account;

import java.util.List;
//mybatis只需要写接口就可以了，不需要写实现类。
public interface AccountDao {
    //查询所有账户信息
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);


}
