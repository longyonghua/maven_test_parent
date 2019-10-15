package com.longge.dao;

import com.longge.domain.Account;
import org.springframework.stereotype.Repository;

/**
 * @author longge
 * @create 2019-10-15 上午10:15
 */
@Repository
public interface AccountDao {

    Account findById(Integer id);

}
