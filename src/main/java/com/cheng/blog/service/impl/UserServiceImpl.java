package com.cheng.blog.service.impl;

import com.cheng.blog.mapper.UserMapper;
import com.cheng.blog.pojo.User;
import com.cheng.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by baize on 2020/11/7 12:42
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
        
    }
}
