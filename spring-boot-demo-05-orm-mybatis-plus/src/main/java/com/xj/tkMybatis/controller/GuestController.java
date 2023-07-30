package com.xj.tkMybatis.controller;

import com.xj.tkMybatis.domain.Guest;
import com.xj.tkMybatis.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tkGuest")
public class GuestController {
    @Autowired
    private GuestService service;

    @GetMapping
    public String list(Model model){
        List<Guest> list = service.getList();
        model.addAttribute("guests",list);
        return "list";
    }
}
