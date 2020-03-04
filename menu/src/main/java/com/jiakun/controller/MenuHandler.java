package com.jiakun.controller;

import com.jiakun.entity.Menu;
import com.jiakun.entity.MenuVO;
import com.jiakun.entity.Type;
import com.jiakun.repository.MenuRepository;
import com.jiakun.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-26 12:08
 **/
@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private TypeRepository typeRepository;

    @GetMapping("/index")
    public String index() {
        return this.port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        return new MenuVO(0,"",menuRepository.count(),menuRepository.findAll(index,limit));
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        menuRepository.deleteById(id);
    }

    @GetMapping("/findTypes")
    public List<Type> findTypes() {
        return typeRepository.findAll();
    }

    @PostMapping("/save")
    //服务之间的数据传递是通过josn 需要RequestBody注解将其映射成java对象；服务内部前端form表单传来的数据则不用
    public void save(@RequestBody Menu menu) {
        menuRepository.save(menu);
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") long id) {
        return menuRepository.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Menu menu){
        menuRepository.update(menu);
    }

}