package com.cloud.modules.user.controller;

import com.cloud.modules.user.entity.User;
import com.cloud.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/23.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "userInfo")
    public User userInfo(String userId) {

        return userService.getUserInfo(userId);
    }

    @RequestMapping(value = "addUser")
    public String addUser(User user) {
        return userService.addUser(user);
    }
}
