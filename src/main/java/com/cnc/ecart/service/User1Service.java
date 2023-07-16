package com.cnc.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnc.ecart.model.User1;
import com.cnc.ecart.repository.User1Repository;

@Service
public class User1Service {
     @Autowired
     private User1Repository userRepository;
     
     public User1 addUser(User1 user) {
    	 try {
    		  return userRepository.save(user);
    	 }
    	 catch(Exception ex){
    		 System.out.println("Exception occured in addUser:"+ex.getMessage()+"cause:"+ex.getCause());
    	 }
    	 return null;
     }
     public boolean login(String username, String password) {
    	 if(userRepository.login(username,password)>0) {
    		 return true;
    	 }
    	 else {
    		 return false;
    	 }
     }
     public List<User1> getUsers(){
    	 try {
    		 return userRepository.findAll();
    	 }
    	 catch(Exception ex) {
    		 System.out.println("exception occured in getUsers: "+ex.getMessage()+"cause:"+ex.getCause());
    	 }
    	 return null;
     }
     public User1 getUser(int userId){
    	 try {
    		 return userRepository.findById(userId).get();
    	 }
    	 catch(Exception ex) {
    		 System.out.println("exception occured in getUsers: "+ex.getMessage()+"cause:"+ex.getCause());
    	 }
    	 return null;
     }
}
