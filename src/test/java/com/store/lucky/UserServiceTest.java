package com.store.lucky;

import com.github.pagehelper.Page;
import com.store.lucky.user.model.User;
import com.store.lucky.user.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
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

    private static final String PWD = "123456";

    @Test
    public void checkNameAndPwd() {
        boolean result = userService.checkNameAndPwd("sdf", new byte[]{});
        Assert.assertThat(result, is(false));
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setUserName("matt komo");
        user.setUserPwd(DigestUtils.md5Hex(PWD).getBytes());
        boolean result = userService.addUser(user);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void findByPage() {
        Page<User> users = userService.findByPage(1, 2);
        System.out.println("test" + users.getPages());
        System.out.println("test" + users.getPageSize());
    }

    @Test
    public void tt() {
        System.out.println(DigestUtils.md5Hex("123"));
    }
}
