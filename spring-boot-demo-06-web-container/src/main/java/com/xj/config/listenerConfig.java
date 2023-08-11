package com.xj.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class listenerConfig {
    //通过监听器的方式实现对web容器启动监听
    //监听器的方式 会在容器启动的时候 就执行 获取到类全名 输出
    @EventListener(WebServerInitializedEvent.class)
    public void onWebServerReady(WebServerInitializedEvent event) {
        System.out.println("当前web启动类是___>"+event.getWebServer().getClass().getName());
    }


}
