package com.xj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 使用tk mybatis提供的MapperSan
 */
@SpringBootApplication
@MapperScan("com.xj.tkMybatis.dao")
@org.mybatis.spring.annotation.MapperScan("com.xj.mybatisPlus.dao")
public class OrmMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisPlusApplication.class, args);
    }

}
