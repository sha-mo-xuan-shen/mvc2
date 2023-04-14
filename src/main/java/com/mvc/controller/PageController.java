package com.mvc.controller;

import com.mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {

    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("跳转到文本");
        return "response text";
    }

    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        User user = new User();
        user.setName("tom");
        user.setAge(15);
        return user;
    }

    @RequestMapping("toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回Json数据");
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setName("tom");
        user1.setAge(15);
        User user2 = new User();
        user2.setName("jerry");
        user2.setAge(15);
        users.add(user1);
        users.add(user2);
        return users;
    }
}
