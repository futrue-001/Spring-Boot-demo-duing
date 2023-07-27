package com.xj.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 实体类 客人
 */
@Entity //表面这是一个实体类
@Data
@AllArgsConstructor //添加一个全参的构造方法
@NoArgsConstructor //无参构造方法
public class Guest implements Serializable {
    @Id
    private Integer id;//id
    private String name;//名称
    private String role;//角色
}
