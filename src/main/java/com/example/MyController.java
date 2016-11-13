package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chen on 16/9/6.
 */
@Controller
public class MyController {
    @RequestMapping("/info")
    @ResponseBody
    Map index111() {
        Map result = new HashMap();
        result.put("name", "30");
        return result;
    }




    @RequestMapping("/locationInfo")
    @ResponseBody
    Map locationInfo() {
        Map result = new HashMap();
        result.put("北京", "中国");
        result.put("巴黎", "法国");
        result.put("London", "英国");
        result.put("华盛顿", "美国");
        return result;
    }
//
//
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getAllData")
    @ResponseBody
    List<User> findUser() {
        List<User> result = userRepository.findAll();
        return result;
    }


    @RequestMapping("/addData")
    @ResponseBody
    String addUser() {
        ArrayList<String> tempArray = new ArrayList<String>();
        tempArray.add("A");
        tempArray.add("C");
        tempArray.add("D");
        tempArray.add("E");
        tempArray.add("F");
        tempArray.add("G");
        tempArray.add("H");
        tempArray.add("L");
        tempArray.add("M");
        tempArray.add("I");
        tempArray.add("P");

        int randomName = (int) (Math.random() * 10);

        userRepository.save(new User(tempArray.get(randomName), 10));
        return "result";
    }



}
