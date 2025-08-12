package com.example.my_sample_api.controller;

import com.example.my_sample_api.model.User;
import com.example.my_sample_api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // すべてのユーザーを取得するAPI
    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    // 特定のユーザーをIDで取得するAPI
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }
}
