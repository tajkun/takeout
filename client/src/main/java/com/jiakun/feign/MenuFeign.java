package com.jiakun.feign;

import com.jiakun.entity.Menu;
import com.jiakun.entity.MenuVO;
import com.jiakun.entity.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-26 15:30
 **/
@FeignClient(value ="menu" )
public interface MenuFeign {

    @GetMapping("/menu/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);

    @DeleteMapping("/menu/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);

    @GetMapping("/menu/findTypes")
    public List<Type> findTypes();

    @PostMapping("/menu/save")
    public void save(Menu menu);

    @GetMapping("/menu/findById/{id}")
    public Menu findById(@PathVariable long id);

    @PutMapping("/menu/update")
    public void update(Menu menu);

}