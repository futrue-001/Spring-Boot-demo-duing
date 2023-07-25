package com.xj.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实体类 客人
 */
@Data
@AllArgsConstructor //添加一个全参的构造方法
@NoArgsConstructor //无参构造方法
public class Guest {
    private String name;//名称
    private String role;//角色
}
