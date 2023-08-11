package com.xj.config;

import com.xj.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

//通过配置的方式将监听器添加进去

/**
 * 我们之前的方式是在web.xml添加filter的配置
 * <filter>
 *     <filter-name>myFilter</filter-name>
 *     <filter-class>com.xj.filter.WebFilter</filter-class>
 * </filter>
 * <filter-mapping>
 *     <filter-name>myFilter</filter-name>
 *     <url-pattern>/*</url-pattern>
 * </filter-mapping>
 */
//将之前配置文件做的时现在交割 工厂去初始化 过滤器
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<Filter> filterRegistrationBean() {
        //创建一个工厂 进行存储 我们的filter并交给spring管理
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new MyFilter());
        bean.setName("myFilter");
        bean.addUrlPatterns("/*");
        return bean;
    }
}
