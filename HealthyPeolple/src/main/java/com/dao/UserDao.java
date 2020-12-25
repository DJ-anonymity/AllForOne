package com.dao;

import com.pojo.User;

public interface UserDao {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    User selectByPrimaryKey(Integer uid);

    User selectByUserName(String username);

    int updateByPrimaryKey(User record);
}