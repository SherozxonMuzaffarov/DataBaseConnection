package com.example.databaseconnection.controller;

import com.example.databaseconnection.entity.UserModel;
import com.example.databaseconnection.exception.UserModelNotFoundedException;
import com.example.databaseconnection.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Value("${welcome.message}")
    private String message;

    @GetMapping("/")
    public String getMe(){
        return message;
    }

    @PostMapping("/save")
    public UserModel saveUser(@RequestBody UserModel model){
        return userService.saveUser(model);
    }

    @GetMapping(value = "/app/{id}")
    public UserModel getById(@PathVariable("id") Long Id) throws UserModelNotFoundedException {
        return userService.getById(Id);
    }

    @GetMapping("/app")
    public List<UserModel> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("/update/{id}")
    public UserModel updateUser(@PathVariable("id") Long Id, @RequestBody UserModel model){
        return userService.updateUser(Id, model);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Long Id){
        userService.deleteUser(Id);
    }


}
