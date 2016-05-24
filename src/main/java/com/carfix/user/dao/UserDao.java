package com.carfix.user.dao;

import com.carfix.api.annotation.ApiRepository;
import com.carfix.domain.User;

/**
 * Created by Administrator on 2016-05-12.
 */
@ApiRepository
public interface UserDao {
    User getUserByUsername(String username);

    Long getUserId();

    int update(User user);
}
