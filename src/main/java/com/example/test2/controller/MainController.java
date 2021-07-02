package com.example.test2.controller;

import com.example.test2.bean.UserBean;
import com.example.test2.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    UserService userService;
    @RequestMapping("/test")
    public String text(){
        return "start1";
    }
    @RequestMapping("/start")
    public String user(){
        return "start";
    }

    @RequestMapping(value = "searchById",method = RequestMethod.POST)
    public UserBean search(int id){
        return userService.searchUserById(id);

    }

}
