package com.experience.service.impl;

import com.experience.dao.User_login_dao;
import com.experience.entity.User;
import com.experience.service.User_login_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("user_login_service")
public class User_login_service_impl implements User_login_service {
    @Autowired
    User_login_dao userLoginDao;
    @Override
    public User getUser(User user) {
        return userLoginDao.isUser(user);
    }
}
