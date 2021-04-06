package com.service;

import com.mapper.UserMapper;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> selectUser(){
        List<User> users = userMapper.selectUser();
        System.out.println(users);
        return users;
    }

    public User selByName(String name){
        User user = userMapper.selByName(name);
        return user;
    }
}
