package com.xj.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义端点
 *      1.自定义类 添加@Endpoint注解指定端点id(名称) 交给spring容器管理
 *      2.自定义一个方法 添加@ReadOperation 注解 并返回Json格式的数据 key-value
 */
@Component
@Endpoint(id = "myEndpoint")
public class MyEndpoint {

    @ReadOperation
    @ResponseBody
    public Map<String,String> endPoint(){
        Map<String,String> map = new HashMap<>();
        map.put("my endpoint","hello my endpoint ");
        map.put("my endpoint1","hello my endpoint1 ");
        return map;
    }

}
