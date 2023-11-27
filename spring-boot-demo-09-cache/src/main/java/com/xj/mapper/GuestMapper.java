package com.xj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xj.bean.Guest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GuestMapper extends BaseMapper<Guest> {
}
