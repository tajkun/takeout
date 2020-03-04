package com.jiakun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-26 12:07
 **/
@SpringBootApplication
@MapperScan("com.jiakun.repository")
public class MenuApplication {
    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class,args);
    }
}