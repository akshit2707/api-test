package com.example.api.controller;

import com.example.api.modal.User;
import com.example.api.modal.UserInput;
import org.springframework.web.bind.annotation.*;

@RestController
public class myController {

    @GetMapping("/hello")
    public String getUserName(){
        return "hello Suar";
    }
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable String id, @RequestParam String nickName){
        User user  = new User();
        user.setFirstName("Akshit");
        user.setLastName("Kumar");
        user.setPhoneNumber("9113393182");
        user.setId(String.valueOf(id));
        user.setNickName(nickName);
        return  user;
    }

    @PostMapping ("/users")
    public User getUserByPhone(@RequestBody UserInput input){
        User user  = new User();
        user.setFirstName(input.getFirstName());
        user.setLastName(input.getLastName());
        user.setPhoneNumber(input.getPhoneNumber());
        user.setId("123");
        user.setNickName("RandomString");
        return user;
    }

}
