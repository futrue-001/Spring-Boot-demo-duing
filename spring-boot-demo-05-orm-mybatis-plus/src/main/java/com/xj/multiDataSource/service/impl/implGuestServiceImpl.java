package com.xj.multiDataSource.service.impl;

import com.xj.multiDataSource.domain.GuestTest;
import com.xj.multiDataSource.mapper.db1.GuestMapper1;
import com.xj.multiDataSource.mapper.db2.GuestMapper2;
import com.xj.multiDataSource.service.GuestServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class implGuestServiceImpl implements GuestServiceTest {

    //springdemo 数据元
    @Autowired
    private GuestMapper1 mapper1;

    //springdemo2 数据源
    @Autowired
    private GuestMapper2 mapper2;

    @Override
    public List<GuestTest> list() {
        return mapper2.list();
    }
}
