package com.xj.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 自定义健康指示器 实现HealthIndicator 接口
 */
@Component
public class MyHealth implements HealthIndicator {
    @Override
    public Health health() {
        int code = 1;
        if(code != 0){
            return Health.down().withDetail("Error Code",code).build();
        }
        return Health.up().build();
    }
}
