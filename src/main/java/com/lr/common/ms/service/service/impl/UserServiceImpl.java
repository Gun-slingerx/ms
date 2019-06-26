package com.lr.common.ms.service.service.impl;

import com.lr.common.ms.service.dao.UserDao;
import com.lr.common.ms.service.entity.User;
import com.lr.common.ms.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(int id) {
        return userDao.getNameByID(id);
    }
}
