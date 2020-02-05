package com.boot.dong.service.Impl;

import com.boot.dong.entity.User;
import com.boot.dong.mapper.UserMapper;
import com.boot.dong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public Object findObjectById(String id, String entity) {
        if (entity.equals("user")){
            return userMapper.selectByPrimaryKey(Integer.parseInt(id));
        }
        return "null";
    }
}
