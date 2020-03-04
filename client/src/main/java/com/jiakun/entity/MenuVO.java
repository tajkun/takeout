package com.jiakun.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-26 16:34
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVO {

    private int code;
    private String msg;
    private int count;
    private List<Menu> data;

}