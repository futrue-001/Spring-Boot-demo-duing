package com.xj.multiDataSource.mapper.db2;

import com.xj.multiDataSource.domain.GuestTest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestMapper2 {

    @Select("select * from guest")
    public List<GuestTest> list();
}
