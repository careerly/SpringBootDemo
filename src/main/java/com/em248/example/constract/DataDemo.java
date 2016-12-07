package com.em248.example.constract;

import com.em248.example.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tian on 2016/12/7.
 */

public class DataDemo {

    public static List<User> userList = new ArrayList<User>();


    static {
        for(long i = 0 ; i < 10 ; i ++){
            User user = new User();
            user.setId(i);
            user.setUsername("刘慧琳" + i);
            user.setNickName("琳妹妹" + i);
            user.setPassword("tian");
            userList.add(user);
        }
    }


    public static List<User> getUserList(){
        return  userList;
    }

    public static User getUserById(Long id){
        for(User user : userList){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public static List<User> delUserById(Long id){
        User user = getUserById(id);
        if(user != null) {
            userList.remove(user);
        }
            return userList;

    }

    public static List<User> addUser(User user){
        if(user != null){
            userList.add(user);
        }
        return userList;
    }

}
