package com.mvc.service;

import com.mvc.domain.User;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface UserService {
    public void save(User user);
    public List<User> findAll();
}
