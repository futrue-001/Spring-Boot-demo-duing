package com.xj.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "noodles")
@PropertySource("classpath:noodles.properties")
public class NoodlesConfig {
    private String meat;
    private String shallot;

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getShallot() {
        return shallot;
    }

    public void setShallot(String shallot) {
        this.shallot = shallot;
    }
}
