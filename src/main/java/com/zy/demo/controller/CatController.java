package com.zy.demo.controller;

import com.zy.demo.bean.Cat;
import com.zy.demo.service.CatService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/2/18.
 */
@RestController
@RequestMapping("/cat")
public class CatController {
    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save() {
        Cat cat = new Cat();
        cat.setCatAge(3);
        cat.setCatName("jack");
        catService.save(cat);
        return "save ok.";
    }
    @RequestMapping("/delete")
    public String delete(){
        catService.delete(1);
        return "delete ok";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }
}
