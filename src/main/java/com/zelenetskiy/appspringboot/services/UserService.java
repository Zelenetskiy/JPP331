package com.zelenetskiy.appspringboot.services;

import com.zelenetskiy.appspringboot.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void removeUser(Long id);
    User getUserById(Long id);
}
