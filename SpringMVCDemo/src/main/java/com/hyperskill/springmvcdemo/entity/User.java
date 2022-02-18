package com.hyperskill.springmvcdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String username;

//    @Column(name = "firstName")
    @Column
    private String firstName;

//    @Column(name = "lastName")
    @Column
    private String lastName;
//
//    @Column
//    private  String password;
//
//    @Column
//    private boolean enabled;
//
//    @OneToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private UserDetails user_details;


}
