package com.experience.service.impl;

import com.experience.dao.User_modify_dao;
import com.experience.entity.User;
import com.experience.service.User_modify_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("user_modify_service")
public class User_modify_service_impl implements User_modify_service {
    @Autowired
    User_modify_dao user_modify_dao;
    @Override
    public int userModify_Service(User user) {
        int i = user_modify_dao.userModify_Dao(user);
        return i;
    }
}
