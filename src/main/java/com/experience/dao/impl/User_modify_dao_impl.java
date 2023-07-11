package com.experience.dao.impl;

import com.experience.dao.User_modify_dao;
import com.experience.entity.User;
import com.experience.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("user_modify_dao")
public class User_modify_dao_impl implements User_modify_dao {
    @Override
    public int userModify_Dao(User user) {

        SqlSession session = MybatisUtils.getSession();
        int i = session.update("userModify",user);
        session.commit();
        session.close();
        return i;
    }
}
