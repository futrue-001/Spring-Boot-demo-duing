package com.xj.mybatisPlus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xj.mybatisPlus.bean.Guest;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface GuestDaoPLus extends BaseMapper<Guest> {
    /**
     * 使用mybatisPlus 给我们提供的类
     */

//    @Select("select * from guest ")
//    public List<Guest> getList();
}
