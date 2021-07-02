package com.example.test2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.test2.mapper")
public class Test2Application {

    public static void main(String[] args) {
        SpringApplication.run(Test2Application.class, args);
    }

}
