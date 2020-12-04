package com.cheng.blog.service.impl;

import com.cheng.blog.service.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by baize on 2020/11/7 16:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class UserServiceImplTest  {
    @Autowired
    UserService userService;
    @Test
    public void getUsers() {
        System.out.println(userService.getUsers().toString());
    }
}