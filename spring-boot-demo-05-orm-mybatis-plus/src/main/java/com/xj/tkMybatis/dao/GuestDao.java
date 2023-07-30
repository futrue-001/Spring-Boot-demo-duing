package com.xj.tkMybatis.dao;

import com.xj.tkMybatis.domain.Guest;
import org.apache.ibatis.annotations.Mapper;


//使用tkMybatis 直接进行继承接口 使用它所提供的实现类以及方法
@Mapper
public interface GuestDao extends tk.mybatis.mapper.common.Mapper<Guest> {
//
//    /**
//     * 查询所有客人信息
//     * @return list
//     */
//    @Select("select id,name,role from guest")
//    public List<Guest> getList();
}
