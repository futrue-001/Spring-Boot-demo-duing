package com.xj.service.impl;

import com.xj.domain.Guest;
import com.xj.dao.GuestDao;
import com.xj.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> getList() {
        return guestDao.getList();
    }

    @Override
    public Guest selectGuestByID(Integer id) {
        return guestDao.selectGuestById(id);
    }

    @Override
    public void update(Guest guest) {
        guestDao.update(guest);
    }
}
