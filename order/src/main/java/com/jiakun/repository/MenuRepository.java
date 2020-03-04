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

    public Menu findById(Long id);

}