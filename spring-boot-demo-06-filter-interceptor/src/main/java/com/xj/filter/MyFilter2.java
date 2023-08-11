package com.xj.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//第二种配置模式 在类上添加 WebFilter 注解
@WebFilter(filterName = "myFilter2" ,urlPatterns = {"/**"})
@Component
public class MyFilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(".................MyFilter2 init.................");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(".................MyFilter2 doFilter.................");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println(".................MyFilter2 destroy.................");
    }
}
