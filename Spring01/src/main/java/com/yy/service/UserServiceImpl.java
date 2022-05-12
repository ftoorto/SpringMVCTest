package com.yy.service;

import com.yy.dao.UserDao;
import com.yy.dao.UserDaoImpl;
import com.yy.pojo.User;

public class UserServiceImpl implements UserService{
    private UserDao userDao=new UserDaoImpl();

    @Override
    public User getUser() {
        return userDao.GetUser();
    }
}
