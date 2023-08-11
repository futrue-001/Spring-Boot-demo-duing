package com.xj.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//自定义配置类
@Configuration
public class WebConfig {

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> customizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                //通过这种形式设置的 优先级会高于配置
                factory.setPort(8080);
            }
        };
    }

    //查看web应用启动类的方法
    //这种方法 必须得是web容器 才行1否则无效果
    //这个方法是web容器启动后的回调函数 进行回调
    @Bean
    public ApplicationRunner runner(WebServerApplicationContext context){
        return args -> {
            System.out.println("当前的web启动容器是---"+context.getWebServer().getClass().getName());
        };
    }

}
