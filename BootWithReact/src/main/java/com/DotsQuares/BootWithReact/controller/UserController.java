package com.DotsQuares.BootWithReact.controller;

import com.DotsQuares.BootWithReact.model.User;
import com.DotsQuares.BootWithReact.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser)
    {
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
}
