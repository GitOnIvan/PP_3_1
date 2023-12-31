package net.gitonivan.ppspringboot.service;

import net.gitonivan.ppspringboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    User getUserByID(long id);

    void addNewUser(User user);

    void updateUser(long id, User updatedUser);

    void deleteUser(long id);
}
