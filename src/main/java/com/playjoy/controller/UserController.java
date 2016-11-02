package com.playjoy.controller;

import com.playjoy.entity.SysUser;
import com.playjoy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by asus on 2016/10/21.
 */
@RestController
@RequestMapping("/usercontroller")
public class UserController {
    @Autowired
    private UserService userservice;

    @RequestMapping("/save")
    public String save() throws Exception {
        SysUser user = new SysUser();
        String  uuid = UUID.randomUUID().toString();
        user.setUserid(uuid);
        user.setUserPasswd("2312312");
        user.setNickName("小明");
        userservice.save(user);
        return "ok";
    }
   @RequestMapping(value = "/get/{userid}")
    public SysUser getById(@PathVariable String userid)throws Exception{
        return userservice.queryById(userid);
    }
    @RequestMapping("/aa")
    public String getString()throws Exception{
        return "hello word!zz1";
    }


}