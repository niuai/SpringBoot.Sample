package com.niuai.demo.controller;

import com.niuai.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @Qualifier("myServiceImpl2")
    @Autowired
    private MyService myService;

    @GetMapping("/")
    public String hello() {
        myService.test();
        return "Hello Spring Boot!";
    }
}
