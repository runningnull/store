package com.store.lucky.user.controller;

import com.store.lucky.user.model.User;
import com.store.lucky.user.service.UserService;
import com.store.lucky.user.vo.UserVO;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author: linzj
 * date: 2019/3/13
 * time: 14:17
 * description: No Description
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public boolean addUser(@RequestBody @Valid UserVO userVO) {
        if (userVO == null) {
            logger.info("addUser {}", userVO);
        }
        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        user.setUserPwd(DigestUtils.md5Hex(userVO.getPwd()).getBytes());
        boolean result = userService.addUser(user);
        return result;
    }
}
