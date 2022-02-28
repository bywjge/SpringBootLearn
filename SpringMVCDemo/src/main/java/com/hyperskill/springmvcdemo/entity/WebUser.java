package com.hyperskill.springmvcdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebUser {
    private String username;
    private String password;
    private String role;


}
