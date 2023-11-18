package Controller

import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Controller
import service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class HelloController {
    @Autowired
    HelloService service;

    @RequestMapping("/hello")
    String hello(){
        service.sout();
        "index"
    }
}
