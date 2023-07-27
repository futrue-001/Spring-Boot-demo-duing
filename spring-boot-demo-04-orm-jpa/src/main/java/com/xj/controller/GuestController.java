package com.xj.controller;

import com.xj.bean.Guest;
import com.xj.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 客人 的 controller 层
 */
@Controller
@RequestMapping("/guest")
public class GuestController {
    //进行简单的 crud 操作

    @Autowired
    private GuestService service;

    //查询数据 还未学习连接数据库 先进行简单的数据查询
    @GetMapping
    public String guestList(Model model){
        //调用service层进行 查询数据
        List<Guest> guests = service.guestList();
        model.addAttribute("guests",guests);
        return "list";
    }

}
