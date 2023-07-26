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

    //客人新增
    @PostMapping(path = "add")
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
            return "redirect:/guest";
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
     * @PathVariable 注解表示接收 {name} name 的值
     * @return 页面地址
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(@PathVariable String name,Model model){
        Guest guest = service.getGuest(name);
        model.addAttribute("guest",guest);
        return "updateView";
    }


    /**
     * 修改客人信息
     * @return list展示页面
     */
    @PutMapping("/update")
    public String guestUpdate(Guest guest,Model model){
        String result = service.updateGuest(guest);
        if(result == null){
            model.addAttribute("result","出现异常请联系管理员进行处理");
        }else if("".equals(result)){
            model.addAttribute("result","禁止修改客人名称");
        }else{
            return "redirect:/guest";
        }
        return "updateView";
    }


    /**
     * Restful 规则 使用delete 表示删除操作 参数在 / 后 用{} 包起来
     *   {} 内的参数在接收时必须在接收时使用 @PathVariable注解
     * @param name 删除客人id
     * @return 返回主页面
     */
    @DeleteMapping("/delete/{name}")
    public String  guestDelete(@PathVariable String name){
        service.deleteGuest(name);
        return "redirect:/guest";
    }


}
