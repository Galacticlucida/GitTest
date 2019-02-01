package cn.lyc.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @description:上传到gitHub上的版本问2.0
 */
@Controller
public class HelloController {
//    @RequestMapping({"/","/index.html"})
//    public String index(){
//        return "index";
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(){
        return "Hello World";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        //classpath:templates/success.html
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        System.out.println("");
        return "success";
    }
}

