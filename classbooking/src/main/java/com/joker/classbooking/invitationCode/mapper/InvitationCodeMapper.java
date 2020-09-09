package com.joker.classbooking.invitationCode.mapper;

import com.joker.classbooking.invitationCode.entity.InvitationCode;
import com.joker.classbooking.user.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface InvitationCodeMapper {

    InvitationCode selectById(int id);

    InvitationCode selectByInvitationCode(String invitationCode);

    void addNewInvitationCode(InvitationCode invitationCode);

    void decreaseRemainingCount(InvitationCode invitationCode);
}
