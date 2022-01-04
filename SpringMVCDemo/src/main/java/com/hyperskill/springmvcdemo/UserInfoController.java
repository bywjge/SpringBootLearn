package com.hyperskill.springmvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@Component
public class UserInfoController {

//    @PostMapping("/user")
//    public String userStatus(@RequestBody UserInfo user) {
//        if (user.isEnabled()) {
//            return String.format("Hello! %s. Your account is enabled.", user.getName());
//
//        }
//        else {
//            return String.format("Hello! Nice to see you, %s! Your account is disabled",
//                    user.getName()
//            );
//        }
//    }
    List<UserInfo> userList1 = new ArrayList<>();

    @PostMapping("/user")
    public String userStatus(@RequestBody List<UserInfo> userList) {
        userList1 = userList;
        return  String.format("Added %d users", userList.size());
    }
//[{"id":1,"name":"zhangsan","phone":"110","enabled":false},{"id":2,"name":"lisi","phone":"110","enabled":true}]

    @GetMapping("/getuser")
    public List<UserInfo> getUser() {
        return userList1;
    }



}
