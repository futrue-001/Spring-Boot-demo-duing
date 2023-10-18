package com.xj.errorConfig;


import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * springboot 自定义错误页指派 可以自定义返回错误页 是实现 ErrorViewResolver 接口
 *  配置完后 需要交由spring管理
 */
@Component
public class ErrorConfig implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {


        if(status == HttpStatus.NOT_FOUND){
            ModelAndView mv = new ModelAndView();
            mv.setViewName("/error");
//            return mv; //返回自定义的错误页
        }

        return null;
    }
}
