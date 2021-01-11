package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        User user = userService.queryById((Integer) session.getAttribute("id"));
        return user;
    }
//    @RequestMapping("/check")
//    public String CheckUser(@RequestParam("username") String username,
//                             @RequestParam("password") String password,
//                             Map<String,Object> map, HttpSession session){
//        if (userService.CheckLogin(username,password)==0){
//            session.setAttribute("loginUser", username);
//            return "main";}
//        else{
//            map.put("msg","用户名或密码错误");
//            return "login";}
//    }
    @GetMapping("/checkLogin")
    public String checkLogin(@RequestBody User user,
                            Map<String,Object> map, HttpSession session){
        Integer status = userService.CheckLogin(user);
        if (status<4){
            session.setAttribute("username", user.getUsername());
            session.setAttribute("id", user.getUid());
            session.setAttribute("status", user.getStatus());
        }
        switch(status){
            case 1:
                return "main1";
            case 3:
                return "main3";
            default:
                break;
        }
        map.put("msg","用户名或密码错误");
        return "login";
    }
    @RequestMapping("/resign")
    public String Resign(User user,Map<String,Object> map){
        int status = userService.Resign(user);
        System.out.println("status: "+status);
        map.put("msg","注册成功,请登录");
        return "redirect:/login";
    }
    @RequestMapping("login")
    public String loginUser(){
        return "login.html";
    }
}
