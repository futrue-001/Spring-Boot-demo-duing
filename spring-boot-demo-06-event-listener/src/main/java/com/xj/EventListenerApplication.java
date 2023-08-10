package com.xj;

import com.xj.listener.MyListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListenerMethodProcessor;

@SpringBootApplication
public class EventListenerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EventListenerApplication.class, args);
        context.addApplicationListener(new MyListener1());//通过全局上下文对象 添加进监听器
    }

}
