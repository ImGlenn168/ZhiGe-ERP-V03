package com.java.zhigeerpv03.controller;

import com.java.zhigeerpv03.entity.User;
import com.java.zhigeerpv03.service.UserService;
import com.java.zhigeerpv03.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/login")
    public Result findUser(@RequestBody User user) {
        return userService.loginUser(user);
    }

    @PostMapping("/user/register")
    public Result addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PostMapping("/user/check")
    public Result checkUser(@RequestBody User user) {
        return userService.findByUserName(user);
    }
}
