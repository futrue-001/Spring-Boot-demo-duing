package com.xj.listener;

import com.xj.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class MyListener3{
    @EventListener()
    public void test(MyEvent myEvent) {
        myEvent.out("MyListener3 监听到了");
    }
}
