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

    public List<User> findAll(int index,int limit);
    public User findById(long id);
    public int count();
    public void save(User user);
    public void update(User user);
    public void deleteById(long id);

}