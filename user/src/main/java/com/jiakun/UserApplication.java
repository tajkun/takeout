package com.jiakun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-28 11:00
 **/
@SpringBootApplication
@MapperScan("com.jiakun.repository")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}