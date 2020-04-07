package com.iflytek.service.impl;

import com.iflytek.dao.UserDao;
import com.iflytek.domain.User;
import com.iflytek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public void addStu(User user) {
        userDao.addUser(user);
    }

    @Override
    public void delStu(int id) {
        userDao.delUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User selectStuById(int id) {
        return userDao.selectStuById(id);
    }
}
