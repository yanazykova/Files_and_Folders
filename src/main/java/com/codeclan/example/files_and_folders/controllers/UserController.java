package com.codeclan.example.files_and_folders.controllers;

import com.codeclan.example.files_and_folders.models.User;
import com.codeclan.example.files_and_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}