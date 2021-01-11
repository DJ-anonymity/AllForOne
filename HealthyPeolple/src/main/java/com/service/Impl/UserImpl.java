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
    public Integer CheckLogin(User user) {
        User user1 = userDao.selectByUserName(user.getUsername());
        if (user.getUid()>0)
            if (user.getPassword().equals(user.getPassword()))
                return user.getStatus();
        return 2;
    }

    @Override
    public Integer Resign(User user) {
        userDao.insert(user);
        return 0;
    }

    @Override
    public User queryById(Integer i){
        i++;
        System.out.println("i is :"+i);
        return userDao.selectByPrimaryKey(i);
    }

    @Override
    public User queryByName(String name) {
        return null;
    }
}
