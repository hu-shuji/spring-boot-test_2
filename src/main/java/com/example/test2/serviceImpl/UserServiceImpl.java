package com.example.test2.serviceImpl;

import com.example.test2.bean.UserBean;
import com.example.test2.mapper.UserMapper;
import com.example.test2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public UserBean loginIn(String name,String password){
        return userMapper.getInfo(name,password);
    }
    @Override
    public UserBean searchUserById(int id){
        return userMapper.selectUserById(id);
    }
    @Override
    public int insertUser_S(UserBean userBean){

        return userMapper.insertUser(userBean);
    }
    @Override
    public int deleteUser_S(int id){

        return userMapper.deleteUser(id);
    }
    @Override
    public int updateUser_S(UserBean userBean){

        return userMapper.updateUser(userBean);
    }


}
