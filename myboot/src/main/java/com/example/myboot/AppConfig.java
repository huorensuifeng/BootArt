package com.example.myboot;

import com.example.myboot.bean.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "user")
    public User initUser() {
        User u = new User();
        u.setName("asd");
        return u;

    }
}