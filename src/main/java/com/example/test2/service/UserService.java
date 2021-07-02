package com.example.test2.service;

import com.example.test2.bean.UserBean;


public interface UserService {

    UserBean loginIn(String name,String password);
    UserBean searchUserById(int id);
    int insertUser_S(UserBean userBean);
    int deleteUser_S(int id);
    int updateUser_S(UserBean userBean);


}
