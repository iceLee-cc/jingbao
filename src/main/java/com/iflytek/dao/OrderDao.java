package com.iflytek.dao;

import com.iflytek.domain.Order;
import com.iflytek.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface OrderDao {
    @Select("select * from tb_order")
    public List<Order> selectAllOrder();

    public User selectOrderById(@Param("order_id")int oderId);

    public void addOrder(Order order);

    public void delUser(@Param("order_id")int oderId);

    public void updateUser(Order order);
}
