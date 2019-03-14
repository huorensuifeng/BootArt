package com.example.myboot.aop;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public void printUser(User user) {
        if(user == null){
            new Exception("user 为空");
        }else
            System.out.println(user.getName()+"\n"+user.getId());
    }

}
