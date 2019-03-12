package com.store.lucky.model;

public class User {
    private String uuid;

    private String userName;

    private String remark;

    private byte[] userPwd;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public byte[] getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(byte[] userPwd) {
        this.userPwd = userPwd;
    }
}