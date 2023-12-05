package net.gitonivan.ppspringboot.service;


import net.gitonivan.ppspringboot.model.User;
import net.gitonivan.ppspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override

    public List<User> getUsersList() {
        return userRepository.getUsersList();
    }

    @Override

    public User getUserByID(long id) {
        return userRepository.getUserByID(id);
    }

    @Override
    @Transactional
    public void addNewUser(User user) {
        userRepository.addNewUser(user);

    }

    @Override
    @Transactional
    public void updateUser(long id, User updatedUser) {
        userRepository.updateUser(id, updatedUser);


    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userRepository.deleteUser(id);

    }
}
