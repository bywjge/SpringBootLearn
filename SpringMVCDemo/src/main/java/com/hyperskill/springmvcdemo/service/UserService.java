package com.hyperskill.springmvcdemo.service;

import com.hyperskill.springmvcdemo.entity.User;
import com.hyperskill.springmvcdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }


    public User save(User toSave) {
        return userRepository.save(toSave);
    }

}
