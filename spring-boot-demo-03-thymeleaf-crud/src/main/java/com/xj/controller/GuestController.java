package com.xj.controller;

import com.xj.bean.Guest;
import com.xj.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 客人 的 controller 层
 */
@Controller
public class GuestController {
    //进行简单的 crud 操作

    @Autowired
    private GuestService service;

    //查询数据 还未学习连接数据库 先进行简单的数据查询
    @RequestMapping(value = "/guest/list")
    public String guestList(Model model){

        //调用service层进行 查询数据
        List<Guest> guests = service.guestList();
        model.addAttribute("guests",guests);
        return "list";
    }

    //客人新增
    @RequestMapping(path = "guest/add",method = RequestMethod.POST)
    public String guestAdd(Guest guest,Model model) {
        if(guest == null || guest.getName().equals("")){
             model.addAttribute("result","请输入正确的内容");
             return "addView";
        }
        String s = service.addGuest(guest);
        if(s == null){
            model.addAttribute("result","后台出现问题,请联系管理员进行处理");
        }
        if(s.equals("success")){
            return "redirect:/guest/list";
        }
        if(s.equals("")){
            model.addAttribute("result","客人已存在");
        }

        return "addView";
    }

    /**
     * 获取新增客人的试图
     * @return 地址
     */
    @RequestMapping("/addView")
    public String addView(){
        return "addView";
    }

    /**
     * 页面请求返回修改页面
     * @param name 需要修改的客人名称
     * @return 页面地址
     */
    @RequestMapping("/toUpdate")
    public String toUpdate(String name,Model model){
        Guest guest = service.getGuest(name);
        model.addAttribute("guest",guest);
        return "updateView";
    }


    /**
     * 修改客人信息
     * @return list展示页面
     */
    @RequestMapping("/guest/update")
    public String guestUpdate(Guest guest,Model model){
        String result = service.updateGuest(guest);
        if(result == null){
            model.addAttribute("result","出现异常请联系管理员进行处理");
        }else if("".equals(result)){
            model.addAttribute("result","禁止修改客人名称");
        }else{
            return "redirect:/guest/list";
        }
        return "updateView";
    }


    @RequestMapping("/guest/delete")
    public String  guestDelete(String name){
        service.deleteGuest(name);
        return "redirect:/guest/list";
    }


}
