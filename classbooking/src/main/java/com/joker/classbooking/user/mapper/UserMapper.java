package com.joker.classbooking.user.mapper;

import com.joker.classbooking.user.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper{

    User selectById(int id);

    void addNewUser(User user);
}
