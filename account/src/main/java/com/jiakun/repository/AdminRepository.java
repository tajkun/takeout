package com.jiakun.repository;

import com.jiakun.entity.Admin;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-28 14:50
 **/
public interface AdminRepository {

    public Admin login(String username,String password);

}