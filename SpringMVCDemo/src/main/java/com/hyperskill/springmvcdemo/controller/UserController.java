package com.hyperskill.springmvcdemo.controller;

import com.hyperskill.springmvcdemo.entity.User;
import com.hyperskill.springmvcdemo.service.UserService;
import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user1/create")
    public String saveUser(@RequestBody List<User> users) {
        // calculate how many users has created
        Integer count = 0;
        for(User user:users){
            userService.save(new User(
                    user.getId(), user.getUsername(),
                    user.getFirstName(), user.getLastName()));
            count++;
        }
        return "Add " + count + " user";
    }
//
    @GetMapping("/user1/getInfoId/{id}")
    public User getUser(@PathVariable long id) {
        return userService.findUserById(id);
    }

    @GetMapping("/user1/getInfoName/{name}")
    public List<User> getUser(@PathVariable String name) {
//        return userService.findUserByUsername(name);
        List<User> result = userService.findUserByUsernameContains(name);
//        System.out.println("结果长度：" + result.size());
        return result;
    }




}
