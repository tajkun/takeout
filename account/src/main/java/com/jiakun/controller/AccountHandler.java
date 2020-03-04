package com.jiakun.controller;

import com.jiakun.repository.AdminRepository;
import com.jiakun.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-28 15:05
 **/
@RestController
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    private UserRepository userReposity;

    @Autowired
    private AdminRepository adminReposity;

    @GetMapping("/login/{username}/{password}/{type}")
    public Object login(@PathVariable("username") String username,
                        @PathVariable("password") String password,
                        @PathVariable("type") String type){
        Object object = null;
        switch (type){
            case "user":
                object = userReposity.login(username,password);
                break;
            case "admin":
                object = adminReposity.login(username,password);
                break;
        }
        return object;

    }
}