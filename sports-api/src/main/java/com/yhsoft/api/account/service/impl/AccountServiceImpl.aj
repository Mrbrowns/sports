package com.yhsoft.api.account.service.impl;

import com.yhsoft.api.account.dao.AccountDao;
import com.yhsoft.api.account.domain.Account;
import com.yhsoft.api.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    /**
     *
     * @param username
     * @return
     */
    @Override
    public Account getUserByName(String username) {
        return accountDao.findByName(username);
    }
}
