package com.zy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2017/2/18.
 * 使用RestController 等价于 @Controller和 @RequestBody
 */
@RestController
public class HelloController {
    /**
     * 这里我们使用@RequestMapping ,建立请求映射
     * http:localhost:8080/hello
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return "hello 2017";
    }

    /**
     * Spring Boot默认使用的json解析框架是jackson
     * @return
     */
    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(22);
        demo.setName("zhangsan");
        demo.setCreateTime(new Date());
        demo.setRemarks("这是备注信息");
        return demo;
    }
}
