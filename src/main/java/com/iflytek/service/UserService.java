package com.iflytek.service;

import com.iflytek.domain.User;

import java.util.List;

public interface UserService {
   public List<User> selectAllUser();

   public void addStu(User user);

   public void delStu(int id);

   public void updateUser(User user);

   public User selectStuById(int id);
}
