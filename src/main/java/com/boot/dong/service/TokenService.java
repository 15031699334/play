package com.boot.dong.service;

import com.boot.dong.entity.User;

public interface TokenService {
    public String getToken(User user);
}
