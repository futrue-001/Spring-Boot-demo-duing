package com.xj.lombok.controller;

import com.xj.lombok.bean.lombok;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController 注解代表Controller 和 responseBody
public class LomBokController {

    @RequestMapping("/lombok")
    @ResponseBody
    public lombok lombok(){
        lombok lombok = new lombok();
        lombok.setName("xj");
        lombok.setPassword("666");
        return lombok;
    }
}
