package com.jiakun.entity;

import lombok.Data;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-28 14:48
 **/
@Data
public class Admin {
    private long id;
    private String username;
    private String password;
}