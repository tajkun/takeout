package com.jiakun.repository;

import com.jiakun.entity.Menu;

import java.util.List;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-26 14:22
 **/
public interface MenuRepository {

    public List<Menu> findAll(int index,int limit);
    public int count();
    public Menu findById(Long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
}