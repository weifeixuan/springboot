package com.ruifucredit.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWroldController {

    @RequestMapping("hello")
    public String helloWorldController (){

        return "hello world";
    }
}



