package com.em248.example.controller;

import com.em248.example.constract.DataDemo;
import com.em248.example.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tian on 2016/12/7.
 */
@RestController
public class DataController {



    @RequestMapping("/list")
    public List<User> getUsers(){
        return DataDemo.getUserList();
    }

    @RequestMapping("/add")
    public List<User> addUser(User user){
        return DataDemo.addUser(user);
    }

    @RequestMapping("/del")
    public List<User> delUser(@RequestParam(value = "id") Long id){
        return DataDemo.delUserById(id);
    }


}
