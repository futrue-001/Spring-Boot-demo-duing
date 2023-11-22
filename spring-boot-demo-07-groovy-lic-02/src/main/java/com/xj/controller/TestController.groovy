package com.xj.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class TestController {

    @RequestMapping("/test")
    @ResponseBody
    String test() {
        "hello word!!!"
    }


    String test02(){
        def a = ""
        a = 123
        ""
    }

}
