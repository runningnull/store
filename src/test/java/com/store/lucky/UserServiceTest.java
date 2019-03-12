package com.store.lucky;

import com.store.lucky.user.model.User;
import com.store.lucky.user.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;

/**
 * @author: linzj
 * date: 2019/3/12
 * time: 15:01
 * description: No Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void checkNameAndPwd() {
        boolean result = userService.checkNameAndPwd("sdf", new byte[]{});
        Assert.assertThat(result, is(false));
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setUserName("tom1");
        user.setUserPwd("2324".getBytes());
        boolean result = userService.addUser(user);
        Assert.assertThat(result, is(true));
    }
}
