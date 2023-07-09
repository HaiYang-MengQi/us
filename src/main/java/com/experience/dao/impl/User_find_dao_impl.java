package com.experience.dao.impl;

import com.experience.dao.User_find_dao;
import com.experience.entity.User;
import com.experience.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class User_find_dao_impl implements User_find_dao {
    @Override
    public void findUser() {

        SqlSession session= MybatisUtils.getSession();
        Integer[] integers={1,2,3,4,5,6,7,8,9};
        List<User> list = session.selectList("allUser",integers);
        for(User user : list)
            System.out.println(user.toString());
        session.close();
    }

    public static void main(String[] args) {
        User_find_dao u =new User_find_dao_impl();
        u.findUser();
    }
}
