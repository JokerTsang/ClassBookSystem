package com.joker.classbooking.invitationCode.entity;

public class InvitationCode {

    private Integer id;
    private String invitationCode;
    private Integer remainCount;
    private Integer intialAmount;
    private String invitationCodeStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public Integer getRemainCount() {
        return remainCount;
    }

    public void setRemainCount(Integer remainCount) {
        this.remainCount = remainCount;
    }

    public Integer getIntialAmount() {
        return intialAmount;
    }

    public void setIntialAmount(Integer intialAmount) {
        this.intialAmount = intialAmount;
    }

    public String getInvitationCodeStatus() {
        return invitationCodeStatus;
    }

    public void setInvitationCodeStatus(String invitationCodeStatus) {
        this.invitationCodeStatus = invitationCodeStatus;
    }

    @Override
    public String toString() {
        return "InvitationCode{" +
                "id=" + id +
                ", invitationCode='" + invitationCode + '\'' +
                ", remainCount=" + remainCount +
                ", intialAmount=" + intialAmount +
                ", invitationCodeStatus='" + invitationCodeStatus + '\'' +
                '}';
    }
}
