package com.joker.classbooking.user.entity;

public class User {
    private Integer id;
    private String identity;
    private String name;
    private String sex;
    private String password;
    private String telephone;
    private String userType;
    private String invitationCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", identity='" + identity + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", userType='" + userType + '\'' +
                ", invitationCode='" + invitationCode + '\'' +
                '}';
    }
}
