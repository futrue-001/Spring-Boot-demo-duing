package com.xj.config;

import com.xj.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//自定义配置类 是实现 WebMvcConfigurer 类
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //因为我们拦截器交给spring管理 了 这里就不能进行创建 需要spring注入给我们
        registry.addInterceptor(interceptor).addPathPatterns("/api");
    }
}
