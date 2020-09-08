package com.joker.classbooking.user.controller;

import com.joker.classbooking.user.entity.User;
import com.joker.classbooking.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.selectById(id).toString();
    }

    @RequestMapping("addUser/")
    public String addUser(@PathVariable User user){
        if (null == user)
            return "400 Bad request";
        return null;
    }
}
