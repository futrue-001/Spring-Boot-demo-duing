package com.xj.dao;

import com.xj.bean.Guest;

import java.util.List;

/**
 * 客户的数据层 进行数据交互
 */
public interface GuestDao {

    /**
     * 查询所有的 客人信息
     */
    public List<Guest> listGuest();

    /**
     * 新增客人的方法
     * @param guest  （name ,  role ）
     * @return   ""  表示 客人存在
     *           <br> "success" 表示 保存成功
     *           <br> null 表示 出现异常
     */
    public String addGuest(Guest guest);

    /**
     * 删除 客人信息的方法
     * @param name 客人名称
     */
    public void deleteGuest(String name);

    /**
     * 修改客人信息
     * @param guest （name , role ）
     * @return ”“ 表示 客人不存在
     *            <br> "success" 表示 修改成功
     *            <br> null 表示 出现异常
     */
    public String updateGuest(Guest guest);

    /**
     * 通过name 寻找客人信息
     * @param name 客人名称
     * @return 客人信息
     *          <br>null 表示没有这位客人
     */
    Guest getGuest(String name);

}
