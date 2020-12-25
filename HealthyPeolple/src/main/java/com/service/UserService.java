package com.service;

import com.pojo.User;

public interface UserService {
    Integer CheckLogin(String username,String password);

    Integer Resign(User user);

    public Integer test(Integer i);
}
