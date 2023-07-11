package com.experience.controller;

import com.experience.entity.User;
import com.experience.service.User_modify_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User_Modify_Controller {
    @Autowired
    User_modify_service user_modify_service;
    @RequestMapping("Modify")
    public String modify(User user){
        int i = user_modify_service.userModify_Service(user);
        System.out.println(i);
        return "redirect:login.jsp";
    }
}
