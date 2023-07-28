package com.xj.dao;

import com.xj.domain.Guest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GuestDao {

    public List<Guest> getList();

}
