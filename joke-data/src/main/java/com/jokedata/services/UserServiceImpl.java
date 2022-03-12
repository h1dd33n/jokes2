package com.jokedata.services;

import com.jokedata.models.User;

import java.util.List;

public interface UserServiceImpl {
    public List<User> getAllUsers();
    public User findByFirstName(String firstName);
    public User findByLastName(String lastName);
    public User findByEmail(String email);
    public void addUser(User user);
    public void deleteUser(User user);
}
