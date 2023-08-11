package com.xj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping("/api")
    public String test(ModelAndView mv) {
        mv.addObject("1","1");
        System.out.println("testController test.............");
        return "success.html";
    }
}
