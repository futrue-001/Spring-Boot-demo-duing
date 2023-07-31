package com.xj.multiDataSource.controller;

import com.xj.multiDataSource.service.GuestServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestControllerTest {
    //多数据源测试

    @Autowired
    private GuestServiceTest service;

    @RequestMapping("/guestTest")
    public String list(Model model) {
        model.addAttribute("guests",service.list());
        return "list";
    }


}
