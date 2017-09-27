package com.yhsoft.api.account.service;


import com.yhsoft.api.account.domain.Account;

public interface AccountService {
    /**
     * Gets the user by name.
     *
     * @param username the user name
     * @return the user by name
     */
    public Account getUserByName(String username);
}
