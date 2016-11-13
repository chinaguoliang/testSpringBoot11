package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenguoliang on 2016/10/6.
 */
@Controller
public class TestMybatisController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/TestMybatis")
    @ResponseBody
    public String user() {
        User user = userMapper.findUserByName("王伟");
        return user.getName() + "-----" + user.getAge();
    }
}
