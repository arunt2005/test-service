package com.apps.controller;

import com.apps.model.User;
import com.apps.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // Save user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    // Get all users
    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }
}
