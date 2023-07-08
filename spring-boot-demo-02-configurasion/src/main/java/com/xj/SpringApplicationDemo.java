package com.xj;

import com.xj.config.FoodConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication//声明这个是springBoot的入口类
//@EnableConfigurationProperties({FoodConfig.class})//声明properties文件的配置类
public class SpringApplicationDemo {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplicationDemo.class,args);//启动springBoot
    }

}
