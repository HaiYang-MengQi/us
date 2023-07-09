package com.experience.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

public class Create_Tables {

    public static void main(String[] args) {

       try {
           ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
           JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
           jdbcTemplate.execute("create table user (" +
                   "id int primary key auto_increment," +
                   "username varchar(9) unique ," +
                   "password varchar(11))");
           System.out.println("用户表创建完成!");
       }catch (Exception e){
           System.out.println(e.getMessage()+e.getStackTrace());
       }finally {
           System.out.println("用户表创建失败!");
       }

    }
}
