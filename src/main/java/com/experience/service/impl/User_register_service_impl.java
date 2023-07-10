package com.experience.service.impl;

import com.experience.dao.User_Register_dao;
import com.experience.entity.User;
import com.experience.service.User_register_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("user_register_service")
public class User_register_service_impl implements User_register_service {
    @Autowired
    User_Register_dao user_register_dao;
    @Override
    public boolean userAdd_Service(User user) {
        return user_register_dao.userAdd_Dao(user);
    }
}
