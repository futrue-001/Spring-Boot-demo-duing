package com.xj.tkMybatis.service;

import com.xj.tkMybatis.domain.Guest;

import java.util.List;

public interface GuestService {
    /**
     * 查询所有客人信息
     * @return list
     */
    public List<Guest> getList();
}
