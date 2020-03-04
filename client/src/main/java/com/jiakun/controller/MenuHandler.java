package com.jiakun.controller;

import com.jiakun.entity.Menu;
import com.jiakun.entity.MenuVO;
import com.jiakun.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * @program: takeout
 * @description:
 * @author: Jiakun
 * @create: 2020-02-26 15:36
 **/
@Controller
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuFeign menuFeign;

    /*
    //这是rest传参方式
    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index,@PathVariable("limit") int limit) {
        return menuFeign.findAll(index,limit);
    }
*/

//    这是前端传统传参方式 ？参数
    @GetMapping("/findAll")
//    返回数据 不是视图
    @ResponseBody
    public MenuVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit) {
        int index = (page-1)*limit;
        return menuFeign.findAll(index,limit);
    }


    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location) {
        return location;
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
          menuFeign.deleteById(id);
          return "redirect:/menu/redirect/menu_manage";
    }

    @GetMapping("/findTypes")
    public ModelAndView findTypes(){
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("menu_add");
      modelAndView.addObject("list",menuFeign.findTypes());
      return modelAndView;
    }

    @PostMapping("/save")
    public String save(Menu menu){
        menuFeign.save(menu);
        return "redirect:/menu/redirect/menu_manage";
    }

    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") long id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("menu_update");
        modelAndView.addObject("menu",menuFeign.findById(id));
        modelAndView.addObject("list",menuFeign.findTypes());
        return modelAndView;
    }

    @PostMapping("/update")
    public String update(Menu menu){
        menuFeign.update(menu);
        return "redirect:/menu/redirect/menu_manage";
    }
}