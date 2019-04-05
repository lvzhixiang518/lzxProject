package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/getUser")
    public User getUser(int id){
        User user = new User();
        user = userService.findUserById(id);
        return user;
    }
}
