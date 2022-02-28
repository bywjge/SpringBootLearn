package com.hyperskill.springmvcdemo.controller;

import com.hyperskill.springmvcdemo.entity.WebUser;
import com.hyperskill.springmvcdemo.repository.WebUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RegistrationController {

    @Autowired
    WebUserRepository userRepo;
    @Autowired
    PasswordEncoder encoder;

    @PostMapping("/register")
    public void register(@RequestBody WebUser user) {
        user.setPassword(encoder.encode(user.getPassword()));

        userRepo.save(user);
    }

}
