package com.xj.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xj.bean.Guest;
import com.xj.mapper.GuestMapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService extends ServiceImpl<GuestMapper,Guest> {

//    @Cacheable(cacheNames = "guestList")
    public List<Guest> guestList(){
        System.out.println("查询所有的客人信息");
        return baseMapper.selectList(null);
    }

    //将查询的数据存储缓存

    /**
     * key 缓存的键
     * condition id 大于 1 的才进行存储进缓存
     */
    @Cacheable(cacheNames = "guests" , key = "#id" /*, condition = "#id > 1"*/)
    public Guest guest(Integer id){
        return baseMapper.selectById(id);
    }


    //更新后更新缓存信息
    @CachePut(cacheNames = {"guests"}, key = "#guest.getId()")
    public Guest guestEdit(Guest guest) {
        baseMapper.updateById(guest);
        return guest;
    }

    /**
     * beforeInvocation 在执行数据库更新后 就执行清除缓存操作
     */
    @CacheEvict(cacheNames = {"guests"} , key = "#id" , beforeInvocation = true)
    public void guestDelete(Integer id){
        baseMapper.deleteById(id);
        int i = 1/0;
    }


}
