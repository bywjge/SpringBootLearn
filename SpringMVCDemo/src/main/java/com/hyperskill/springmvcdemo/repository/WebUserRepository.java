package com.hyperskill.springmvcdemo.repository;

import com.hyperskill.springmvcdemo.entity.WebUser;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WebUserRepository {
    final private Map<String, WebUser> users = new ConcurrentHashMap<>();

    public WebUser findWebUserByUsername(String username) {
        return users.get(username);
    }

    public void save(WebUser user) {
        users.put(user.getUsername(), user);
    }

}
