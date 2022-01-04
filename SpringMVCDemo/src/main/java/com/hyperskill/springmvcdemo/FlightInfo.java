package com.hyperskill.springmvcdemo;


import lombok.AllArgsConstructor;
import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.AllArguments;

@Data
@AllArgsConstructor
public class FlightInfo {
    private String from;
    private String to;
    private String gate;
}
