package com.xj.service.impl;

import com.xj.bean.Guest;
import com.xj.dao.GuestDao;
import com.xj.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * 客人 service 接口的实现类
 */
@Service
public class GuestServiceImpl implements GuestService,Serializable {
    //service 是业务层 需要数据层来为service 做支持

    @Autowired
    private GuestDao dao;

    @Override
    public List<Guest> guestList() {
        return dao.findAll();
    }



    //测试 下面方法不使用



    @Override
    public String addGuest(Guest guest) {
        return null;
    }

    @Override
    public void deleteGuest(String name) {

    }

    @Override
    public String updateGuest(Guest guest) {
        return null;
    }

    @Override
    public Guest getGuest(String name) {
        return null;
    }

    @Override
    public void guestDelete(String name) {

    }


}
