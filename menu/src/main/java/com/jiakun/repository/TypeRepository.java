package com.jiakun.repository;

import com.jiakun.entity.Type;

import java.util.List;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-26 17:09
 **/
public interface TypeRepository {
    public Type findById(long id);
    public List<Type> findAll();
}