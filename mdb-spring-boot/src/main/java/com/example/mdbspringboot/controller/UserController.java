package com.example.mdbspringboot.controller;

import com.example.mdbspringboot.Repository.UserRepository;
import com.example.mdbspringboot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public   UserRepository userRepository;


    @GetMapping("/users")
    public List<User> getUsers(){
            return userRepository.findAll();
    }

    @GetMapping("/addUser")
    public void addUsers(){
        userRepository.save(new User("5","Rohit","Sharma"));
        userRepository.save((new User("6","Virat","Kholi")));
    }

    @GetMapping("/demo")
    public String getName(){
        return "I am vignesh";
    }
}
