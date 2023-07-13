package com.xj.springbootdemo03template.controller;

import com.xj.springbootdemo03template.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleafTest01")
    public String test01(Model model){
        model.addAttribute("name", "小杰");
        return "thymeleaf/index";
    }

    @RequestMapping("/thymeleafTest02")
    public String test02(Model model){
        //携带一个标签 进行返回
        model.addAttribute("element", "<h1>小杰</h1>");

        return "thymeleaf/index";
    }

    @RequestMapping("/thymeleafTest03")
    public String test03(Model model){
        User user = new User();
        user.setName("小杰");
        user.setSex("男");
        user.setNationality("汉");
        model.addAttribute("user",user);
        return  "thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String test04(){
        return "thymeleaf/welcome";
    }


}
