package com.cnc.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.ecart.model.User1;
import com.cnc.ecart.service.User1Service;

@RestController
public class User1Controller {
     @Autowired
     private User1Service userService;
     
     @PostMapping("/add-user")
     public User1 addUser(@RequestBody User1 user) {
    	 User1 u=userService.addUser(user);
    	 if(u!=null) {
    		 return u;
    	 }
    	 else {
    		 return null;
    	 }
     }
     @PostMapping("user-login")                  //can't work this api
     public String login(@RequestBody User1 user) {
    	 if(userService.login(user.getEmail(),user.getPassword())) {
    		 return "success";
    	 }
    	 else {
    		 return "unsuccess";
    	 }
     }
     
     @GetMapping("/users")
     public List<User1> getUsers(){
    	 return userService.getUsers();
     }
     @GetMapping("/users/{userId}")
     public User1 getUser(@PathVariable("userId") int userId) {
    	 return userService.getUser(userId);
     }
}
