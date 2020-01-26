package cn.itcast.service.impl;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;

import java.util.List;
@Service
public class AccountServiceImpl  implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有账户。。。");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户");

    }
}
