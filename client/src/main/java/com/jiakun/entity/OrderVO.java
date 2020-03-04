package com.jiakun.entity;

import lombok.Data;

import java.util.List;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-29 20:41
 **/
@Data
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<Order> data;
}