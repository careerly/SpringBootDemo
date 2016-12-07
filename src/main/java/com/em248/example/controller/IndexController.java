package com.em248.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tian on 2016/12/7.
 */

@Controller
public class IndexController {


    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }

}
