package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @RequestMapping("/save")
    public String save(){
        return "save";
    }

    @ResponseBody
    @RequestMapping("/delete")
    public String delete(){
        return "delete";
    }
}
