package com.xj.controller;

import com.xj.domain.Guest;
import com.xj.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @RequestMapping()
    public String list(Model model){
        List<Guest> guests = guestService.getList();
        model.addAttribute("guests",guests);
        return "list";
    }
}
