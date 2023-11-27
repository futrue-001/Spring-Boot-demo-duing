package com.xj.controller;

import com.xj.bean.Guest;
import com.xj.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService service;

    @RequestMapping("/list")
    public List<Guest> guestList(){
        System.out.println("controller执行guestList方法");
        return service.guestList();
    }

    @GetMapping("/{id}")
    public Guest guest(@PathVariable("id") Integer id){
        System.out.println("controller执行guest方法 查询一个客人信息");
        return service.guest(id);
    }

    @GetMapping("/edit")
    public Guest guestEdit(Guest guest){
        System.out.println("controller执行guestEdit方法 修改一个客人信息");
        return service.guestEdit(guest);
    }

    @GetMapping("/delete/{id}")
    public String guestDelete(@PathVariable("id") Integer id){
        System.out.println("controller执行guestDelete方法 删除一个客人信息");
        service.guestDelete(id);
        return "success";
    }

}
