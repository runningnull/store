package com.store.lucky.user.service.impl;

import com.store.lucky.user.dao.UserMapper;
import com.store.lucky.user.model.User;
import com.store.lucky.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: linzj
 * date: 2019/3/12
 * time: 14:59
 * description: No Description
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean checkNameAndPwd(String name, byte[] pwd) {
        return false;
    }

    @Override
    public boolean addUser(User user) {
        return 1 == userMapper.insert(user);
    }

    @Override
    public User fetchUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
