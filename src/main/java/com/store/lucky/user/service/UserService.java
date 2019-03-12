package com.store.lucky.user.service;

import com.store.lucky.user.model.User;

/**
 * @author: linzj
 * date: 2019/3/12
 * time: 14:58
 * description: No Description
 */
public interface UserService {

    /**
     * 验证账号和密码
     *
     * @param name
     * @param pwd
     * @return
     */
    boolean checkNameAndPwd(String name, byte[] pwd);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 根据id获取用户
     *
     * @param id
     * @return
     */
    User fetchUserById(long id);

}
