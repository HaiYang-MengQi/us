package com.experience.dao.impl;

import com.experience.dao.User_login_dao;
import com.experience.entity.User;
import com.experience.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("user_login_dao")
public class User_login_dao_Impl implements User_login_dao {

    @Override
    public User isUser(User user) {
        SqlSession session= MybatisUtils.getSession();
//        session.close();
        return session.selectOne("user_Login",user);
    }
}
