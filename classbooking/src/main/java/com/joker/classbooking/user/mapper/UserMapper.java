package com.joker.classbooking.user.mapper;

import com.joker.classbooking.user.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper{

    User selectById(int id);

    User selectByIdentity(String identity);

    void addNewUser(User user);
}
