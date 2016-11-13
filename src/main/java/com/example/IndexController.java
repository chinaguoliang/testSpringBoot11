package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chen on 16/9/22.
 */
@Controller
public class IndexController {
    /**
     * 映射静态资源
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/index.html")
    public String index2() {
        return "index";
    }

    @RequestMapping("/product")
    public String product() {
        return "product";

    }

    @RequestMapping("/userinfo")
    public String getTest(){
        return "userinfo";
    }

}
