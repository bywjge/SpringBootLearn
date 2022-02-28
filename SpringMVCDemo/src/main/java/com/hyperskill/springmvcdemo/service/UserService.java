package com.hyperskill.springmvcdemo.service;

import com.hyperskill.springmvcdemo.entity.User;
import com.hyperskill.springmvcdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<User> findUserByUsernameContains(String username) {
        return userRepository.findUserByUsernameContains(username);
    }


    public User save(User toSave) {
        return userRepository.save(toSave);
    }



}
