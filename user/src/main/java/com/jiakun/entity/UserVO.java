package com.jiakun.entity;

import lombok.Data;

import java.util.List;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-28 14:08
 **/
@Data
public class UserVO {
    private int code;
    private String msg;
    private int count;
    private List<User> data;
}