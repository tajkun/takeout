package com.jiakun.repository;

import com.jiakun.entity.User;

import java.util.List;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-28 11:12
 **/
public interface UserRepository {

    public User findById(long id);
}