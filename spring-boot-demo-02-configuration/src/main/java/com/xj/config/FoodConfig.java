package com.xj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


/**
 * @ConfigurationProperties 声明这是类是properties文件的配置类
 *     prefix 前缀 表示 properties 文件的一级目录
 *      food.meat=烤肉
 *      food.rice=拌饭
 *
 * 配置了@ConfigurationProperties注解后
 *       需要在springBoot入口类上添加 @EnableConfigurationProperties注解 让spring管理
 *      或者添加@Configuration注解
 */
@Configuration
@ConfigurationProperties(prefix = "food")
public class FoodConfig {
    //Food类的配置类
    private String meat;
    private String rice;

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }
}
