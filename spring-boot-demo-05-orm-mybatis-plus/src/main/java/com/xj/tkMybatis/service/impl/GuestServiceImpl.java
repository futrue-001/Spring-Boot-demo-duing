package com.xj.tkMybatis.service.impl;

import com.xj.tkMybatis.dao.GuestDao;
import com.xj.tkMybatis.domain.Guest;
import com.xj.tkMybatis.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class GuestServiceImpl implements GuestService, Serializable {
    @Autowired
    private GuestDao dao;
    @Override
    public List<Guest> getList() {
        return dao.selectAll();
    }
}
