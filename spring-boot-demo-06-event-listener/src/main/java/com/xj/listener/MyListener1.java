package com.xj.listener;

import com.xj.event.MyEvent;
import org.springframework.context.ApplicationListener;

public class MyListener1 implements ApplicationListener<MyEvent> {


    @Override
    public void onApplicationEvent(MyEvent event) {
        event.out("MyListener1 监听到啦");
    }
}
