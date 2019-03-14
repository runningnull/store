package com.store.lucky.user.so;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * @author: linzj
 * date: 2019/3/14
 * time: 9:16
 * description: No Description
 */
public class UserSO implements Serializable  {
    private static final long serialVersionUID = 1L;

    private Long uuid;

    private Date createTime;

    private Date updateTime;

    private String userName;

    private String remark;

    private byte[] userPwd;

    private String pwd;

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
        this.userName = userName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public byte[] getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(byte[] userPwd) {
        this.userPwd = userPwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "UserSO{" +
                "uuid=" + uuid +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", userName='" + userName + '\'' +
                ", remark='" + remark + '\'' +
                ", userPwd=" + Arrays.toString(userPwd) +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
