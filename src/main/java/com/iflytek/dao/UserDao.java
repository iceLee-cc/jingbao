package com.iflytek.dao;

import com.iflytek.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from t_user_info")
    public List<User> selectAllUser();

    @Insert("insert t_user_info(username,realName,phone,address) values(#{username},#{realName},#{phone},#{address})")
    public void addUser(User user);

    @Delete("delete from t_user_info where id=#{id}")
    public void delUser(@Param("id")int id);

    @Update("update t_user_info set realName=#{realName},phone=#{phone},address=#{address} where id=#{id}")
    public void updateUser(User user);

    @Select("select * from t_user_info where id=#{id}")
    public User selectStuById(@Param("id")int id);
}
