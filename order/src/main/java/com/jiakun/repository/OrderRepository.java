package com.jiakun.repository;

import com.jiakun.entity.Order;

import java.util.List;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-29 17:09
 **/
public interface OrderRepository {
    public void save(Order order);
    public List<Order> findAllByUid(int index,int limit,long uid);
    public int countByUid(long uid);
    public List<Order> findAll(int index,int limit);
    public void updateState(long id);
    public int count();
}