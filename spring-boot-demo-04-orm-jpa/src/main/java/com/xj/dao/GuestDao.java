package com.xj.dao;

import com.xj.bean.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GuestDao extends JpaRepository<Guest,Integer> {

}
