package com.pmumentor.service;

import com.pmumentor.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    public void registerUser(String name, String email, String password) {
        User user = new User(name, email, password);
        users.add(user);
        System.out.println("User registered: " + name);
    }

    public boolean login(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Login successful for: " + user.getName());
                return true;
            }
        }
        System.out.println("Login failed");
        return false;
    }
}
