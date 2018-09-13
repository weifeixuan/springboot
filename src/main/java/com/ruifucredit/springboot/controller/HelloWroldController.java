package com.ruifucredit.springboot.controller;


import com.ruifucredit.springboot.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@RestController
public class HelloWroldController {

    @RequestMapping("/hello")
    public String helloWorldController (){

        return "hello world";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        User user = new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate);
        return user;
    }
}



