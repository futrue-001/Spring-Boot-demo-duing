package com.xj;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;
import java.util.Set;

/**
 * redis 使用 在Java中可以使用 jedis 客户端进行redis连接
 */
public class Redis {
    public static void main(String[] args) {
        JedisPoolConfig config = new JedisPoolConfig();
        // 设置连接池中最多允许放100个Jedis对象
        config.setMaxTotal(100);
        // 设置连接池中最大允许空闲连接
        config.setMaxIdle(100);
        // 设置连接池中最小允许的连接数
        config.setMinIdle(10);
        // 借出连接的时候是否测试有效性,推荐false
        config.setTestOnBorrow(false);
        // 归还时是否测试,推荐false
        config.setTestOnReturn(false);
        // 创建时是否测试有效  开发的时候设置为false,实践运行的时候设置为true
        config.setTestOnCreate(false);
        // 当连接池内jedis无可用资源时,是否等待资源,true
        config.setBlockWhenExhausted(true);
        // 没有获取资源时最长等待1秒,1秒后没有还没有的话就报错
//        config.setMaxWaitMillis(1000); //遗弃
        config.setMaxWait(Duration.ofSeconds(1));

        JedisPool pool = new JedisPool(config,"192.168.1.131",6379);
        //通过jedis池 获取连接
        try(Jedis jedis = pool.getResource()){
            //创建连接
            System.out.println("=============list============");
            jedis.lrange("list",0,1).forEach(Redis::myPrint);
            System.out.println("=============hash============");
            jedis.hgetAll("hash").forEach(Redis::myPrint);
            System.out.println("=============set============");
            jedis.smembers("set").forEach(Redis::myPrint);
            System.out.println("=============string============");
            System.out.println(jedis.get("string"));
            jedis.close();
            }
    }
    public static void myPrint(String s){
        System.out.println(s +"\t");
    }
    public static void myPrint(String k,String v){
        System.out.println(k +" -> "+v+"\t");
    }

}
