package com.jiakun.controller;

import com.jiakun.entity.Menu;
import com.jiakun.entity.MenuVO;
import com.jiakun.entity.User;
import com.jiakun.entity.UserVO;
import com.jiakun.feign.MenuFeign;
import com.jiakun.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;


/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-26 15:36
 **/
@Controller
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserFeign userFeign;


    @GetMapping("/findAll")
    @ResponseBody
    public UserVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit) {
        int index = (page-1)*limit;
        UserVO userVO = new UserVO();
        userVO.setCode(0);
        userVO.setMsg("");
        userVO.setCount(userFeign.count());
        userVO.setData(userFeign.findAll( index, limit));
        return userVO;
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") long id){
        return userFeign.findById(id);
    }

    @GetMapping("/count")
    public int count(){
        return userFeign.count();
    }

    @PostMapping("/save")
    public String save(User user){
        user.setRegisterdate(new Date());
        userFeign.save(user);
        return "redirect:/menu/redirect/user_manage";
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        userFeign.update(user);
    }

//    页面使用window.location.href请求 是get请求 不能用DeleteMapping
    @GetMapping("/deleteById/{id}")
    public String  deleteById(@PathVariable("id") long id) {
        userFeign.deleteById(id);
        return "redirect:/menu/redirect/user_manage";
    }
}