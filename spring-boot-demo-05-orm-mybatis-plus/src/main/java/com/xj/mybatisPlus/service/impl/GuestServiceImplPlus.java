package com.xj.mybatisPlus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xj.mybatisPlus.bean.Guest;
import com.xj.mybatisPlus.dao.GuestDaoPLus;
import com.xj.mybatisPlus.service.GuestServicePlus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImplPlus extends ServiceImpl<GuestDaoPLus,Guest> implements GuestServicePlus {
    @Autowired
    private GuestDaoPLus dao;

    @Override
    public List<Guest> getList() {
        return dao.selectList(null);
    }
}
