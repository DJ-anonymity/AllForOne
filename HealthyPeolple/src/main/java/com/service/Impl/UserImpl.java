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
    public Integer CheckLogin(String username, String password) {
        User user = userDao.selectByUserName(username);
        if (user.getUid()>0)
            if (user.getPassword().equals(password))
                return 0;
        return 1;
    }

    @Override
    public Integer Resign(User user) {
        userDao.insert(user);
        return 0;
    }

    @Override
    public Integer test(Integer i){
        i++;
        System.out.println("i is :"+i);
        return 0;
    }
}
