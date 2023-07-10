package com.experience.dao.impl;

import com.experience.dao.User_Register_dao;
import com.experience.entity.User;
import com.experience.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("user_register_dao")
public class User_Register_dao_impl implements User_Register_dao {
    @Override
    public boolean userAdd_Dao(User user) {
        SqlSession session= MybatisUtils.getSession();
        int i = session.insert("userAdd",user);
        session.commit();
        session.close();
        if (i!=0)
        return true;
        else return false;
    }
}
