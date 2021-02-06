package com.example.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/admin/hello")
    public String hello2() {
        return "admin/hello";
    }

    @GetMapping("/user/hello")
    public String hello3() {
        return "user/hello";
    }

    @GetMapping("/db/hello")
    public String hello4() {
        return "db/hello";
    }

}
