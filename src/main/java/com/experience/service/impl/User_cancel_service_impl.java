package com.experience.service.impl;

import com.experience.dao.User_cancel_dao;
import com.experience.service.User_cancel_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("user_cancel_service")
public class User_cancel_service_impl implements User_cancel_service {
    @Autowired
    User_cancel_dao user_cacel_dao;
    @Override
    public int userCancel_service(int id) {
        int i = user_cacel_dao.userDelete_dao(id);
        return i;
    }
}
