package com.mvc.dao;

import com.mvc.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    @Insert("insert into user2(name,age) values(#{name},#{age})")
    void save(User user);

    @Select("select * from user2")
    List<User> getAll();
}
