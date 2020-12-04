package com.cheng.blog.mapper;

import com.cheng.blog.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by baize on 2020/11/7 15:55
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest  {
    @Autowired
    UserMapper userMapper;

    @Test
    public void getUsers() {
        List<User> users = userMapper.getUsers();
        System.out.println(users.toString());
    }
}