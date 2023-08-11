package com.xj.filter;


import javax.servlet.*;
import java.io.IOException;

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


public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //初始化执行
        System.out.println(".................MyFilter init.................");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(".................MyFilter doFilter.................");
        //处理完后如果符合要求 就进行放行
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {
        //销毁时执行
        System.out.println(".................MyFilter destroy.................");
    }
}
