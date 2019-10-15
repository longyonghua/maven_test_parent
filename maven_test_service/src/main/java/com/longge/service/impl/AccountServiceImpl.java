package com.longge.service.impl;

import com.longge.dao.AccountDao;
import com.longge.domain.Account;
import com.longge.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author longge
 * @create 2019-10-15 上午10:40
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;

    @Override
    public Account findById(Integer id) {
        return dao.findById(id);
    }
}
