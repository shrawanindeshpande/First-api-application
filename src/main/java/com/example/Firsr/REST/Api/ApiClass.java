package com.example.Firsr.REST.Api;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiClass {

    Map<Integer,User> userdb=new HashMap<>();
    @GetMapping("/getWeatherUpdate")
    public String getWeatherUpdate(){
        return "Weather is good! Temperature is 25c and wind is 20kmph!";
    }

    @GetMapping("/addUser")
    public String addUser(@RequestParam("userID")int userID,@RequestParam("userName")String userName,@RequestParam("age")int age){
        User userObj=new User(userName,age,userID);
        userdb.put(userID,userObj);
        return "New user is added";
    }
    @GetMapping("/getUserDetails")
    public User getUserDetails(@RequestParam("userID")int userID){
        User user=userdb.get(userID);
        return user;
    }
    @PostMapping("/addUserViaBody")
    public String addUserViaBody(@RequestBody User userObj){
        int dbKey= userObj.getUserID();
        userdb.put(dbKey,userObj);
        return "New user is added";
    }

}
