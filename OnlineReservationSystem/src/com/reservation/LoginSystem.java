package com.reservation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginSystem {
    private Map<String, User> users = new HashMap<>();

    // Constructor to add some demo users
    public LoginSystem() {
        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));
    }

    // Login function
    public User login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        User user = users.get(username);
        if (user != null && user.authenticate(password)) {
            System.out.println("Login successful!");
            return user;
        } else {
            System.out.println("Invalid username or password. Try again.");
            return null;
        }
    }
}
