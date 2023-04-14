package com.mvc.controller;

import com.mvc.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
// @RequestMapping("/commonParam")
public class User2Controller {

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("普通参数传递 name==>"+name);
        System.out.println("普通参数传递 age==>"+age);
        return "{'module':'common param'}"
        +"普通参数传递 name==>"+name
        +"普通参数传递 age==>"+age;
    }
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(String userName,int age){
        System.out.println("普通参数传递 userName==>"+userName);
        System.out.println("普通参数传递 age==>"+age);
        return "{'module':'common param different name'}";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo参数传递 user==>"+user);
        return "{'module':'pojo param'}"+user;
    }

    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println("pojo参数传递 user==>"+user);
        return "{'module':'pojo param'}"+user;
    }
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("pojo参数传递 likes==>"+ Arrays.toString(likes));
        return "{'module':'pojo param'}"+Arrays.toString(likes);
    }
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("pojo参数传递 likes==>"+ likes);
        return "{'module':'pojo param'}"+likes;
    }

    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("pojo参数传递 likes==>"+ likes);
        return "{'module':'pojo param'}"+likes;
    }
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo参数传递 likes==>"+ user);
        return "{'module':'pojo param'}"+user;
    }
    @RequestMapping("userListParamForJson")
    @ResponseBody
    public String userListParamForJson(@RequestBody List<User> users){
        System.out.println("User参数传递 users===>"+users);
        return "{'module':'userList'}"+users;
    }
    @RequestMapping("dateParamForJson")
    @ResponseBody
    public String dateParamForJson(@RequestBody Date date){
        System.out.println("User参数传递 date===>"+date);
        return "{'module':'userList'}"+date;
    }
    @RequestMapping("dateParam")
    @ResponseBody
    public String dateParam(@DateTimeFormat(pattern = "yyyy-mm-dd") Date date){
        System.out.println("date参数传递 date===>"+date);
        return "{'module':'dateList'}"+date;
    }
}
