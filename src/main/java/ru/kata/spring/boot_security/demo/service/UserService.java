package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByName(String username);
    User getUserByEmail(String email);
    void deleteUserById(Long id);
    void saveUser(User user);
}
