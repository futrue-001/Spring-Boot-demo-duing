package com.xj.service;

import com.xj.domain.Guest;

import java.util.List;

public interface GuestService {
    /**
     * 查询说有的客人息
     * @return 返回所有的客人信息
     */
    List<Guest> getList();

    /**
     * 根据客人id 查询客人信息
     * @param id id
     * @return 客人信息
     */
    Guest selectGuestByID(Integer id);

    /**
     * 更新客人信息
     * @param guest 客人更改的信息
     */
    void update(Guest guest);
}
