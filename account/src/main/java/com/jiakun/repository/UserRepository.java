package com.jiakun.repository;

import com.jiakun.entity.Admin;
import com.jiakun.entity.User;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-28 14:51
 **/
public interface UserRepository {
    public User login(String username, String password);
}