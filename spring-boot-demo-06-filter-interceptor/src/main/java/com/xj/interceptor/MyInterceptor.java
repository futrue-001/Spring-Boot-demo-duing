package com.xj.interceptor;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//这是一个拦截器 实现 HandlerInterceptor 接口
@Component
public class MyInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //preHandle 在controller之前执行 返回值为true 则放过 返回值为false则进行拦截
        System.out.println("MyInterceptor  preHandle.......");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //设置响应状态 postHandle 在返回ModelAndView 之前执行 可以对ModelAndView 进行一些小处理
        System.out.println(handler.getClass().getName());
        modelAndView.setStatus(HttpStatus.NOT_FOUND);
        System.out.println("MyInterceptor  postHandle.......");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //afterCompletion 方法在最后进行执行
        System.out.println("MyInterceptor  afterCompletion.......");

    }
}
