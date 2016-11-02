package com.playjoy.example;

import com.playjoy.entity.DataSign;
import com.playjoy.entity.SysUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asus on 2016/10/21.
 */
@RestController
@RequestMapping("/demo")
public class Dome{

    /**
     * 返回demo数据:
     * 请求地址：http://127.0.0.1:8080/demo/getDemo
     * @return
     */
    @RequestMapping("/getDemo")
    public DataSign getDemo(){
        DataSign data = new DataSign();
        data.setOffPosid("1");
        data.setSignid("2312");
        return data;
    }
    /**
     * 返回fastjson demo数据:
     * 请求地址：http://127.0.0.1:8080/demo/getFastjson
     * @return
     */
    @RequestMapping("/getFastjson")
    public SysUser getFastjson(){
        SysUser  user =new SysUser();
        user.setNickName("nihao");
        user.setUserid("123123123");
        return user;
    }

    /*
    * 错误
    *
    * */
    @RequestMapping("/zeroException")
        public int zero(){
        return 1/0;
    }

    /*
   * 错误
   *
   * */
    @RequestMapping("/aa")
    public int aa(){
        return 100;
    }

    /*
  * 错误
  *
  * */
    @RequestMapping("/bb")
    public int bb(){
        return 4;
    }

 }
