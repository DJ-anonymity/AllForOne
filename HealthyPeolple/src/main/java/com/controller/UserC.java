package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserC {
    @Autowired
    UserService userService;
    @RequestMapping("/check")
    public String CheckUser(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                             Map<String,Object> map, HttpSession session){
        if (userService.CheckLogin(username,password)==0){
            session.setAttribute("loginUser", username);
            return "main";}
        else{
            map.put("msg","用户名或密码错误");
            return "login";}
    }
    @RequestMapping("/resign")
    public String Resign(User user){
        int status = userService.Resign(user);
        System.out.println("status: "+status);
        return "redirect:/login";
    }
    @RequestMapping("login")
    public String loginUser(){
        return "login";
    }
}
