package com.cheng.blog.controller;

import com.cheng.blog.pojo.User;
import com.cheng.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by baize on 2020/11/7 13:15
 */
@RestController
@RequestMapping("/user")
public class UsersController {
    @Resource
    UserService userService;

    @RequestMapping("/all")
    public String getUsers(){
        List<User> users = userService.getUsers();
        System.out.println(users);
        return users.toString();
    }



    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
