package com.jiakun.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-29 17:06
 **/
@Data
public class Order {
    private long id;
    private User user;
    private Menu menu;
    private Admin admin;
    private Date date;
    private int state;
}