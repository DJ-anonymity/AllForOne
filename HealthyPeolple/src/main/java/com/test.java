package com;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class test {
    @Autowired
    UserService userDao;
    @Test
    public void test(){
        userDao.test(1);
        System.out.println("end");
    }
}
