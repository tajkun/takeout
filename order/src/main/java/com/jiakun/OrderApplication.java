package com.jiakun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-24 15:14
 **/
@SpringBootApplication
@MapperScan("com.jiakun.repository")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}