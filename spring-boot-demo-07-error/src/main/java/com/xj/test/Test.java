package com.xj.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
    @RequestMapping("/test")
    public String test() {
        String s = null;
        s.length();
        return "test";
    }
}
