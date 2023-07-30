package com.xj.mybatisPlus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xj.mybatisPlus.bean.Guest;

import java.util.List;

/**
 * 使用mybatis-plus 提供的 IService 接口 实现简易开发模式 简化代码的编写
 *    实现类 需要继承 ServiceImpl<BaseMapper,Bean> 类
 *          该类有两个泛型 一个是 BaseMapper 类型 就是数据持久层 实现的BaseMapper
 *                       二是实体类
 */
public interface GuestServicePlus extends IService<Guest> {

    public List<Guest> getList();
}
