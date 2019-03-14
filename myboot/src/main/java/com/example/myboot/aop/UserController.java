package com.example.myboot.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    // 注入用户服务
    @Autowired
    private UserService userService;

    @RequestMapping("/print")
    @ResponseBody
    public User pringUser(String name,String id){
        User user = null;
        if(name != null){
            user = new User(name,id);
        }
        userService.printUser(user);
        return user;
    }
}
