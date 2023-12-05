package net.gitonivan.ppspringboot.repository;


import net.gitonivan.ppspringboot.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getUsersList();

    User getUserByID(long id);

    void addNewUser(User user);

    void updateUser(long id, User updatedUser);

    void deleteUser(long id);
}
