package com.hyperskill.springmvcdemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String endRegex = "The End\\.";
        String endRegex1 = "The End\\?";
//        String endRegex1 = "The End\\\";

//        System.out.println("The End\\".matches(endRegex1));

        String pattern = "(b|r|go)at"; // matches "bat", "rat" or "goat"
        String answer = "The answer is definitely (yes|no|maybe)";

        System.out.println("The End.".matches(endRegex));
        System.out.println("The End?".matches(endRegex));

        Map<String, String> hashmap = new HashMap<>();
        Collections.synchronizedMap(hashmap);
    }
}
