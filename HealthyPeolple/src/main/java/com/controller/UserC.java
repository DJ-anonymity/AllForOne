package com.controller;

import com.common.ServerResponse;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserC {
    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping("/session")
    public User getSession(HttpSession session){
        User user = (User) session.getAttribute("user");

        return user;
    }

    @PostMapping("/checkLogin")
    @ResponseBody
    public int checkLogin(@RequestBody User user,
                            Map<String,Object> map, HttpSession session){
        user.toString();
        User user1 = userService.CheckLogin(user);

        switch(user1.getStatus()){
            case 1:
            case 3:
                session.setAttribute("user", user1);
                return user1.getStatus();
            default:
                break;
        }
        map.put("msg","用户名或密码错误");
        return 0;
    }
    @PostMapping("/resign")
    @ResponseBody
    public ServerResponse Resign(@RequestBody User user){
        int status = userService.Resign(user);
//        ServerResponse response = new ServerResponse();
//        response.setMsg("注册成功,请登录");
//        response.setRStatus(1);
        System.out.println("status: "+status);
        return ServerResponse.createBySuccessMessage("注册成功,请登录");
    }
    @RequestMapping("login")
    public String loginUser(){
        return "login.html";
    }
}
