package com.example.springbootaop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        view.addObject("name", "自定义首页");
        view.setViewName("index");
        System.out.println("index");
        return view;
    }
}
