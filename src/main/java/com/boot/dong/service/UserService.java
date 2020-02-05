package com.boot.dong.service;

import com.boot.dong.entity.User;

/**
 * 测试
 */
public interface UserService {

    User findByUsername(String username);

    Object findObjectById(String id, String entity);
}
