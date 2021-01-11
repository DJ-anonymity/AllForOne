package com.service;

import com.pojo.User;

public interface UserService {
    Integer CheckLogin(User user);

    Integer Resign(User user);

    public User queryById(Integer id);
    public User queryByName(String name);
}
