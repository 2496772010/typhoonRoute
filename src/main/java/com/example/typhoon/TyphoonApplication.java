package com.example.typhoon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.typhoon.mapper")
public class TyphoonApplication {

    public static void main(String[] args) {
        SpringApplication.run(TyphoonApplication.class, args);
    }

}
