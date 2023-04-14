package com.mvc.controller;

import com.mvc.dao.UserDao;
import com.mvc.domain.User;
import com.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class UsersController {

    // @Autowired
    // public UserService userService;

    @GetMapping("users/all")
    public String findAll(){
        // System.out.println(userService.findAll());
        return "all";
    }
    @DeleteMapping("users/delete/{id}")
    public String deleteById(@PathVariable int id){
        System.out.println("已删除"+id);
        return "删除";
    }
    @PutMapping("users/update")
    public String updateById(@RequestBody User user){
        System.out.println("已更新"+user);
        return "更新";
    }
    @PostMapping("users/post")
    public String save(){
        System.out.println("已添加");
        return "新增";
    }
}
