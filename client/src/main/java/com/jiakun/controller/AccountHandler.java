package com.jiakun.controller;

import com.jiakun.entity.Admin;
import com.jiakun.entity.User;
import com.jiakun.feign.AccountFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-29 15:47
 **/
@Controller
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    private AccountFeign accountFeign;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        @RequestParam("type") String type, HttpSession session) {           //前端form表单传参 传统方式
        Object object = accountFeign.login(username, password, type);
        LinkedHashMap<String,Object> hashMap = (LinkedHashMap) object;
        String result = null;
        String idStr = null;
        long id = 0L;
        if (object == null) {
            result = "login";
        } else {
            switch (type){
                case "user":
                    User user = new User();
                    idStr = hashMap.get("id")+"";
                    id = Long.parseLong(idStr);
                    String nickname = (String) hashMap.get("username");
                    user.setId(id);
                    user.setNickname(nickname);
                    session.setAttribute("user",user);
                    result = "index";
                    break;
                case "admin":
                    Admin admin = new Admin();
                    idStr = hashMap.get("id")+"";
                    id = Long.parseLong(idStr);
                    String username2 = (String) hashMap.get("username");
                    admin.setId(id);
                    admin.setUsername(username2);
                    session.setAttribute("admin",admin);
                    result = "main";
                    break;
            }
        }
        return result;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login.html";
    }

}