package com.xj.mybatisPlus.controller;

import com.xj.mybatisPlus.service.GuestServicePlus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/plusGuest")
public class GuestControllerPlus {
    @Autowired
    private GuestServicePlus service;

    @GetMapping
    public String list(Model model){
        model.addAttribute("guests",service.list());
        return "list";
    }
}
