package com.experience.controller;

import com.experience.entity.User;
import com.experience.service.User_login_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Controller
public class User_login_Controller {
    @Autowired
    private User_login_service user_login_service;
    @RequestMapping(value = {"/login","/userLogin"})
    private String login(User user, HttpSession session,HttpServletResponse response) throws IOException {
       User u = user_login_service.getUser(user);
       if(u!=null){session.setAttribute("user",u);return "redirect:main.jsp";}
        else {
           Object info = null;
           session.setAttribute("暂无此用户,请您先注册!",info);
          return "forward:login.jsp";
           //FIXME 上面一行有问题
        }
    }
}
