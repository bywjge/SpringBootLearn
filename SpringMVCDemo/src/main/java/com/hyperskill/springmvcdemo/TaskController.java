package com.hyperskill.springmvcdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TaskController {

    List<Task> taskList = Arrays.asList(
            new Task(1, "task1", "A first test task", false),
            new Task(2, "task2", "A second test task", true)
    );

    @GetMapping("/test")
    public int returnOne() {
        return 1;
    }


    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return taskList;
    }


//    @GetMapping("/tasks/{id}")
//    public ResponseEntity<Task> getTask(@PathVariable int id) {
//        return new ResponseEntity<>(taskList.get(id), HttpStatus.ACCEPTED) ;
//    }

    @GetMapping("/tasks/{id}")
    public ResponseEntity<Task> getTask(@PathVariable int id) {
        return new ResponseEntity<>(taskList.get(id), HttpStatus.ACCEPTED) ;
    }

}
