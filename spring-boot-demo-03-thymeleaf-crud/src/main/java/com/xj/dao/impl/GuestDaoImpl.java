package com.xj.dao.impl;

import com.xj.bean.Guest;
import com.xj.dao.GuestDao;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.*;

@Repository
public class GuestDaoImpl implements GuestDao, Serializable {
    /**
     * 这里使用 beanProper 文件夹下的 guest.properties 文件作为数据库
     */
    private final List<Guest> guestList = new ArrayList<>();//集合 存储 properties 文件的内容

    {

       guestList.add(new Guest("dmc","老师"));
       guestList.add(new Guest("zzt","老师"));
       guestList.add(new Guest("艾薇","班班"));
       guestList.add(new Guest("dmc","老师"));
    }

    @Override
    public List<Guest> listGuest() {
        return guestList;
    }

    @Override
    public String addGuest(Guest guest) {
//        guestProper.setProperty(guest.getName(),guest.getRole());
        guestList.add(guest);
        return "success";

    }

    @Override
    public void deleteGuest(String name) {
        for(int i = 0;i<guestList.size();i++){
            Guest guest = guestList.get(i);
            if(guest.getName().equals(name)){
                guestList.remove(i);
            }
        }
    }

    @Override
    public String updateGuest(Guest newGuest) {
        for(Guest guest : guestList){
            if(guest.getName().equals(newGuest.getName())){
                    guest.setRole(newGuest.getRole());
                    return "success";
            }
        }
        return "";
    }

    @Override
    public Guest getGuest(String name) {
      for(Guest guest : guestList){
          if(guest.getName().equals(name)){
              return guest;
          }
      }
      return null;
    }

}
