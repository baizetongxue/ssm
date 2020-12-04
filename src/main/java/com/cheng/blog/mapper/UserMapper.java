package com.cheng.blog.mapper;

import com.cheng.blog.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by baize on 2020/11/7 12:35
 */
@Repository
public interface UserMapper {
    List<User> getUsers();
}
