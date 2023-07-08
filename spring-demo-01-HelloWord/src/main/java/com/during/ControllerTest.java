package com.during;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest {

    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "hello During!";
    }


}
