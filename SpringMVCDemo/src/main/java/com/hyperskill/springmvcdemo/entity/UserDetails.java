package com.hyperskill.springmvcdemo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "userDetails")
public class UserDetails {

    private long user_id;

    @Id
    private long user_detail_id;

    private String name;
    private String location;
    private String email;
}
