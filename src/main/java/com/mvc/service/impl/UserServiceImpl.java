package com.mvc.service.impl;

import com.mvc.dao.UserDao;
import com.mvc.domain.User;
import com.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // @Autowired
    UserDao userDao;

    @Override
    public void save(User user) {
        System.out.println("user saving");
        // userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.getAll();
    }
}
