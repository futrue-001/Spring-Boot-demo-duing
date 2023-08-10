package com.xj.controller;

import com.xj.event.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    //通过事件发布器发布事件
    @Autowired
    private ApplicationEventPublisher publisher;


    @RequestMapping("/event")
    public String event(){
        publisher.publishEvent(new MyEvent(this));//发布该事件 监听这个事件的监听器就会执行
        return "Success";
    }
}
