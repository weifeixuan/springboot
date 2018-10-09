package com.ruifucredit.springboot.controller;


import com.ruifucredit.springboot.domain.User;
import com.ruifucredit.springboot.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
public class HelloWroldController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/hello")
    public String helloWorldController (){

        return "hello world";
    }

    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public User getUser(){
        User user=userRepository.findByUserName("aa1");
        System.out.print("获取username");
        return user;
    }

    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}



