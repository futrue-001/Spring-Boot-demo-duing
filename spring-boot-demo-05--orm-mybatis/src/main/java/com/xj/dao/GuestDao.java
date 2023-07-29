package com.xj.dao;

import com.xj.domain.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface GuestDao {

    @Select("select id,name,role from guest  ;")
    public List<Guest> getList();

    @Select("select id,name,role from guest where id = #{id} ;")
    Guest selectGuestById(Integer id);

    @Update("update guest set role = #{role} where id = #{id}")
    void update(Guest guest);
}
