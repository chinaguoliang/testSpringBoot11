package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen on 16/9/10.
 */
@Controller
public class ManController {
    @Autowired
    private ManRepository manRepository;

    @RequestMapping("/addMan")
    @ResponseBody
    String addMain() {
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

        manRepository.save(new Man(tempArray.get(randomName), "工人", "北京"));

        return "result";
    }

    @RequestMapping("/getAllMan")
    @ResponseBody
    List<Man> findUser() {
        List<Man> result = manRepository.findAll();
        return result;
    }
}
