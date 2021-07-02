package com.example.test2.mapper;


import com.example.test2.bean.UserBean;

/*
* Author: jie hu
* Date: 2021.7.1
* 定义登录和增删查改接口
* */
public interface UserMapper {
    UserBean getInfo(String name,String password);
    UserBean selectUserById(int id);
    int insertUser(UserBean userBean);
    int deleteUser(int id);
    int updateUser(UserBean userBean);
}
