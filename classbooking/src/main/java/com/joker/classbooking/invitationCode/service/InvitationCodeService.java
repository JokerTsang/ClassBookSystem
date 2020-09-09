package com.joker.classbooking.invitationCode.service;

import com.joker.classbooking.invitationCode.entity.InvitationCode;
import com.joker.classbooking.invitationCode.mapper.InvitationCodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvitationCodeService {

    @Autowired
    private InvitationCodeMapper invitationCodeMapper;

    public InvitationCode selectById(int id){
        return invitationCodeMapper.selectById(id);
    }

    public InvitationCode selectByInvitationCode(String invitationCode){
        return invitationCodeMapper.selectByInvitationCode(invitationCode);
    }

    public void addNewInvitationCode(InvitationCode invitationCode){
        // TODO validation
        invitationCodeMapper.addNewInvitationCode(invitationCode);
    }

    public void decreaseRemainingCount(InvitationCode invitationCode){
        invitationCodeMapper.decreaseRemainingCount(invitationCode);
    }
}
