package com.xj.multiDataSource.mapper.db1;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xj.multiDataSource.domain.GuestTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GuestMapper1{

    @Select("select * from guest")
    public List<GuestTest> list();
}
