package com.hyperskill.springmvcdemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String summary;
    private boolean enabled;
    private int priority;


}
