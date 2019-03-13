package com.store.lucky.user.model;

import java.util.Date;

public class User {
    private Long uuid;

    private Date createTime;

    private Date updateTime;

    private String userName;

    private String remark;

    private byte[] userPwd;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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