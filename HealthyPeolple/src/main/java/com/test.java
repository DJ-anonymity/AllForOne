package com;

import com.dao.UserDao;
import com.pojo.User;
import com.service.Impl.UserImpl;
import com.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class test {

    @Test
    public void test(){
        //zfgdemo
        UserService userDao = new UserImpl();

        System.out.println("end");
    }
}
