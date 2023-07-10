package com.experience.controller;

import com.experience.entity.User;
import com.experience.service.User_register_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User_register_Controller {
    @Autowired
    User_register_service user_register_service;
    @RequestMapping("register")
    private String register(User user)
    {
        boolean status = user_register_service.userAdd_Service(user);
        if(status)
        return "login";
        else return  "error";
    }

}
