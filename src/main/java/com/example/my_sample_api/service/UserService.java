package com.example.my_sample_api.service;

import com.example.my_sample_api.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;

@Service
public class UserService {

    // (データベースの代わりに)ダミーデータを返す
    private static final List<User> users = Arrays.asList(
            new User(1L, "Taro Yamada", "taro@example.com"),
            new User(2L, "Hanako Tanaka", "hanako@example.com")
    );

    public List<User> findAll() {
        return users;
    }

    public User findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
