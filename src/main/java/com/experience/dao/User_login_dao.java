package com.experience.dao;

import com.experience.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.springframework.stereotype.Repository;


public interface User_login_dao {
    @Results(id = "user" , value = {
            @Result(id = true , column = "id" , property = "id"),
            @Result(column = "user_name" ,property = "user_name"),
            @Result(property = "user_password", column = "user_password"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "tel", column = "tel"),
            @Result(property = "address", column = "address"),
            @Result(property = "word", column = "word")
    })
     User isUser(User user);
}
