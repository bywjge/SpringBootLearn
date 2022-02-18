package com.hyperskill.springmvcdemo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserDetails {

    @Column
    private long user_id;
    @Id
    private long user_detail_id;
    @Column
    private String name;
    @Column
    private String location;
    @Column
    private String email;

}
