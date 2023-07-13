package com.experience.dao.impl;

import com.experience.dao.User_cancel_dao;
import com.experience.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("user_cacel_dao")
public class User_cancel_dao_impl implements User_cancel_dao {
    @Override
    public int userDelete_dao(int id) {
        SqlSession session = MybatisUtils.getSession();
        int i = session.delete("deleteUser",id);
        session.commit();
        session.close();
        return i;
    }
}
