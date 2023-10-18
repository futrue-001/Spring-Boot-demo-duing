package com.xj.exceptionConfig;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionHandle {


    @ExceptionHandler(Exception.class)
    public ModelAndView handle(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/exception");
        mv.addObject("message",e.getMessage());
        return mv;
    }
}
