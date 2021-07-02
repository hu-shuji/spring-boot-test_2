package com.example.test2;

import com.example.test2.bean.UserBean;
import com.example.test2.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test2ApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        UserBean userBean=userService.loginIn("1","1");
        if(userBean!= null){
            System.out.println("ID为");
            System.out.println(userBean.getId());
        }
        else{
            System.out.println("failed");
        }

    }

}
