package com.xj.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("guest")
@Data
public class Guest {
    @TableId
    private Integer id;
    private String name;
    private String role;
}
