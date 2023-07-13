package com.experience.controller;

import com.experience.service.User_cancel_service;
import com.experience.service.impl.User_cancel_service_impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User_cancel_Controller {
    @Autowired
    User_cancel_service user_cancel_service;
    @RequestMapping("Cancel")
    public String cancel(int id)
    {
        int i = user_cancel_service.userCancel_service(id);
        if( i != 0)
            return "login";
        else return  "error";

    }
}
