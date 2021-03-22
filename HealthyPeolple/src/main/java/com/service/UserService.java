package com.service;

import com.pojo.User;

public interface UserService {
    User CheckLogin(User user);

    Integer Resign(User user);

    public User queryById(Integer id);
    public User queryByName(String name);
    int editPassword(User user);
}
