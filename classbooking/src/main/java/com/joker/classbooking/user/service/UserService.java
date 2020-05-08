package com.joker.classbooking.user.service;

import com.joker.classbooking.user.entity.User;
import com.joker.classbooking.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectById(int id){
        return userMapper.selectById(id);
    }
}
