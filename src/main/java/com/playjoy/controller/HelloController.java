package com.playjoy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by asus on 2016/10/31.
 */
@Controller
public class HelloController {
    // 从application.properties 中读取配置，如取不到默认值为Hello Shanhy
    @Value("${application.hello:Hello Angel}")
    private String hello;
    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String,Object> map){
        System.out.println("HelloController.helloJsp().hello1="+hello);
        map.put("hello", hello);
        return "helloJsp";
    }

    @RequestMapping(value="example")

    public ModelAndView example(HttpServletRequest request) {

        return new ModelAndView("helloJsp");

    }

    @RequestMapping(value="login")

    public String login(Map<String,Object> map){
        System.out.println("HelloController.helloJsp().hello0="+hello);
        map.put("hello", hello);
        return "login";
    }

    @RequestMapping(value="index")

    public String index(Map<String,Object> map){
        System.out.println("HelloController.helloJsp().hello1="+hello);
        map.put("hello", hello);
        return "index";
    }
}
