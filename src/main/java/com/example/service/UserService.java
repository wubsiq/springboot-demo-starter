package com.example.service;

import com.example.entity.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    User updateUser(Long id,User user);
    void deleteUser(Long id);
}
