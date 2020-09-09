package com.joker.classbooking.user.service;

import com.joker.classbooking.invitationCode.entity.InvitationCode;
import com.joker.classbooking.invitationCode.mapper.InvitationCodeMapper;
import com.joker.classbooking.invitationCode.service.InvitationCodeService;
import com.joker.classbooking.user.entity.User;
import com.joker.classbooking.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private InvitationCodeService invitationCodeService;

    public User selectById(int id){
        return userMapper.selectById(id);
    }

    public User selectByIdentity(String identity){
        return userMapper.selectByIdentity(identity);
    }

    public User addNewUser(User user) throws Exception {
        // TODO valadation
        User existdeUser = userMapper.selectByIdentity(user.getIdentity());
        if (null != existdeUser)
            throw new Exception("this user had already exist");

        InvitationCode code = invitationCodeService.selectByInvitationCode(user.getInvitationCode());
        if (null == code || "GG".equals(code.getInvitationCodeStatus()) || 0 >= code.getRemainCount()){
            throw new Exception("this register had not be invited or this invitation code is exhausted");
        }

        userMapper.addNewUser(user);

        invitationCodeService.decreaseRemainingCount(code);

        return userMapper.selectByIdentity(user.getIdentity());
    }
}
