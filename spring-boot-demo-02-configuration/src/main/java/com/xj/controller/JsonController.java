package com.xj.controller;

import com.xj.bean.Food;
import com.xj.bean.Noodles;
import com.xj.bean.Soup;
import com.xj.config.FoodConfig;
import com.xj.config.NoodlesConfig;
import com.xj.config.SoupConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @RestController 注解
 * 是 @Controller 和 @ResponseBody 合二为一 只能进行json格式数据返回
 */

@RestController
public class JsonController {
//    @Value("${food.meat}")
//    private String meat;
//    @Value("${food.rice}")
//    private String rice;

    //使用springBoot管理的配置类
    @Autowired
    private FoodConfig foodConfig;

    //测试
    @RequestMapping("/json")
    public String json() {
        return "json hello";
    }

    //返回对象测试
    @RequestMapping("food")
    public Food food() {
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }

    @Autowired
    private SoupConfig soupConfig;
    @RequestMapping("/soup")
    public Soup soup(){
        Soup soup = new Soup();
        soup.setTomato(soupConfig.getTomato());
        soup.setEgg(soupConfig.getEgg());
        return soup;
    }

    @Autowired
    private NoodlesConfig noodlesConfig;
    @RequestMapping("/noodles")
    public Noodles noodles(){
        Noodles noodles = new Noodles();
        noodles.setMeat(noodlesConfig.getMeat());
        noodles.setShallot(noodlesConfig.getShallot());
        return noodles;
    }


}
