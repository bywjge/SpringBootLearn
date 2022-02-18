package com.hyperskill.springmvcdemo.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long orderId;

    @Column(name = "product_type")
    private String productType;

    @Temporal(TemporalType.DATE)
    @Column(name = "order_date")
    private Date orderDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status")
    private Status orderStatus;

    @Transient
    private String orderProgress;


}

enum Status{
    SHIPPED,
    PENDING,
    RECEIVED
}