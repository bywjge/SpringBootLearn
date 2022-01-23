package com.hyperskill.springmvcdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
public class User {

    @Id
    @Column
    private long userId;


    @Column
    private String username;

    @Column
    private  String password;

    @Column
    private boolean enabled;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserDetails user_details;



}
