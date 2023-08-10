package com.xj.listener;

import com.xj.event.MyEvent;
import org.springframework.context.ApplicationListener;

public class MyListener4 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        myEvent.out("MyListener4 监听到了");
    }
}
