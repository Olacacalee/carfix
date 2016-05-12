package com.carfix.user.service;

import com.carfix.domain.User;
import com.carfix.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pc on 2016/5/12.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserInfo(String username) {
        return userDao.getUserByUsername(username);
    }

    public Long test() {
        return userDao.getUserId();
    }
}
