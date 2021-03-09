package com.service.Impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User CheckLogin(User user) {
        User user1 = userDao.selectByUserName(user.getUsername());
        if (user1.getUid()>0)
            if (user1.getPassword().equals(user.getPassword()))
                return user1;
        return null;
    }

    @Override
    public Integer Resign(User user) {
        userDao.insert(user);
        return 0;
    }

    @Override
    public User queryById(Integer i){
        System.out.println("i is :"+i);
        return userDao.selectByPrimaryKey(i);
    }

    @Override
    public User queryByName(String name) {
        return null;
    }
}
