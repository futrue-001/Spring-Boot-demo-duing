package com.xj.mybatisPlus.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("guest")//mybatis-plus提供的注解 表明实体类对于的表名字
public class Guest {
    @TableId("id")
    private Integer id;
    private String name;
    private String role;
}
