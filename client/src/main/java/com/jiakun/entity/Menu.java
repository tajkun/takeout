package com.jiakun.entity;

import lombok.Data;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-26 14:19
 **/
@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}