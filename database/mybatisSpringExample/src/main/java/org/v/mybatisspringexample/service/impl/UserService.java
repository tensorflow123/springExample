package org.v.mybatisspringexample.service.impl;

import org.springframework.stereotype.Service;
import org.v.mybatisspringexample.User;
import org.v.mybatisspringexample.mapper.UserMapper;

import javax.annotation.Resource;

@Service
public class UserService implements org.v.mybatisspringexample.service.UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
