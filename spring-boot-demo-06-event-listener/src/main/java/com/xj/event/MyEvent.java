package com.xj.event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }

    //先定义一个输出方法 发布事件
    public void out(String  msg){
        System.out.println("自定义事件，进行发布..."+msg);
    }

}
