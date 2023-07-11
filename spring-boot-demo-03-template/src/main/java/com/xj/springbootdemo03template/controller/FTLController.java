package com.xj.springbootdemo03template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * 这是一个返回页面的 controller层 就不能使用@RestController
 */

@Controller
public class FTLController {

    @RequestMapping("/ftl")
    public ModelAndView ftl(ModelAndView md){
        //返回页面的时候还需要携带信息 所以我们需要Model类转载数据
        md.setViewName("index");
        md.addObject("now",new Date().toString());
        System.out.println("000000000000000000000000000000000000");
        //需要返回页面
        return md;
    }

    @RequestMapping("/aa")
    public String test1(){
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }


}
