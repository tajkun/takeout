package com.jiakun.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-28 11:09
 **/
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}