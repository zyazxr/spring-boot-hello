package com.zy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/18.
 */
@RestController
public class Hello2Controller {
    @RequestMapping("/helloNew")
    public String hello(){
        return "helloNew";
    }
}
