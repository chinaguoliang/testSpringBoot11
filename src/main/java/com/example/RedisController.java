package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenguoliang on 2016/10/2.
 */
@Controller
public class RedisController {

    @Autowired
    RedisUtil  redisUtil;


    // 例子 http://localhost:8080/setData/key=name/value=chenguoping
    @RequestMapping("/setData/key={key}/value={value}")
    @ResponseBody
    public String setData(@PathVariable("key")String key , @PathVariable("value")String value) {
        boolean result = redisUtil.set(key,value);
        if (result) {
            return "success";
        } else {
            return "failed";
        }
    }

    //例子  http://localhost:8080/getData/key=name
    @RequestMapping("/getData/key={key}")
    @ResponseBody
    public String getData(@PathVariable("key")String key) {
        Object result = redisUtil.get(key);
        if (result != null) {
            return result.toString();
        } else {
            return "failed";
        }
    }
}
