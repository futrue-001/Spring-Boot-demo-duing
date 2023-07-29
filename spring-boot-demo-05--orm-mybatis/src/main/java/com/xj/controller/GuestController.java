package com.xj.controller;

import com.xj.domain.Guest;
import com.xj.service.GuestService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    /**
     * 接收请求 获得 id查询 客人信息 进行展示
     * @param id 客人id
     * @return 返回update 页面 以及 携带客人信息
     */
    @GetMapping("/updateView/{id}")
    public String updateView(@PathVariable Integer id, Model model){
        model.addAttribute("guest",guestService.selectGuestByID(id));
        return "updateView";
    }

    /**
     * 客人信息更新
     * @param guest 客人id
     * @return
     */
    @PostMapping("/update")
    public String updateGuest(Guest guest){
        guestService.update(guest);
        return "redirect:/guest";
    }


}
