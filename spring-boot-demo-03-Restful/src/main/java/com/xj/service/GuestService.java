package com.xj.service;

import com.xj.bean.Guest;

import java.io.Serializable;
import java.util.List;

/**
 * 客人的 service 接口 规范 service
 */
public interface GuestService extends Serializable {

    /**
     * 客人学习查询
     * @return 返回所有的客人 消息记录
     */
    public List<Guest> guestList();

    /**
     * 新增客人
     * @param guest （name , role）
     * @return ”“ 表示 客人存在
     *         <br> "success" 表示 保存成功
     *         <br> null 表示 出现异常
     */
    public String addGuest(Guest guest);

    /**
     * 删除客人 消息
     * @param name 客人的名称
     */
    public void deleteGuest(String name);

    /**
     * 客人消息修改  目前支持 role 修改
     * @param guest （name , role ）
     * @return ”“ 表示 客人不存在
     *              <br> "success" 表示 修改成功
     *              <br> null 表示 出现异常
     */
    public String updateGuest(Guest guest);

    /**
     * 查询Guest 对象学习
     * @param name 查询id
     * @return 对象
     */
    public Guest getGuest(String name);

    /**
     * 删除客人学习
     * @param name 客人名称
     */
    public void guestDelete(String name);


}
