package com.jiakun.feign;

import com.jiakun.entity.Menu;
import com.jiakun.entity.MenuVO;
import com.jiakun.entity.Type;
import com.jiakun.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-28 12:03
 **/
@FeignClient(value = "user")
public interface UserFeign {
    @GetMapping("/user/findAll/{index}/{limit}")
    public List<User> findAll(@PathVariable("index") int index,@PathVariable("limit") int limit);

    @DeleteMapping("/user/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);

    @PostMapping("/user/save")
    public void save(@RequestBody User user);

    @GetMapping("/user/findById/{id}")
    public User findById(@PathVariable long id);

    @PutMapping("/user/update")
    public void update(@RequestBody User user);

    @GetMapping("/user/count")
    public int count();
}