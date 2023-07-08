package com.xj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * @Configuration 将对象交由spring管理
 * @ConfigurationProperties(prefix = "soup") 说明这个类的是配置文件类 类的属性在配置文件里
 * @PropertySource("classpath:tomatoEggSoup.properties") 说明配置文件的位置
 */

@Configuration
@ConfigurationProperties(prefix = "soup")
@PropertySource("classpath:tomatoEggSoup.properties")
public class SoupConfig {

    private String tomato;
    private String egg;

    public String getTomato() {
        return tomato;
    }

    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }
}
