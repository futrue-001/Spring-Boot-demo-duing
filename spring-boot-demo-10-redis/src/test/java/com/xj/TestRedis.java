package com.xj;

import com.xj.springboot.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * springboot 中使用redis 引入 spring-boot-stater-data-redis 依赖
 *  添加application redis连接配置
 *  自动注入RedisTemplate 类
 */

@SpringBootTest(classes = Application.class)
public class TestRedis {
    @Autowired
    RedisTemplate<String ,String> template;
    //在之前获取到Jedis 连接
//    @BeforeAll
//    public static void before() {
//        JedisPoolConfig config = new JedisPoolConfig();
//        config.setMaxIdle(5);
//        JedisPool pool = new JedisPool(config, "192.168.1.131", 6379);
//        jedis = pool.getResource();
//    }

    @Test
    public void test(){
        ValueOperations<String, String> v = template.opsForValue();
        System.out.println(v.get("string"));

    }



}
