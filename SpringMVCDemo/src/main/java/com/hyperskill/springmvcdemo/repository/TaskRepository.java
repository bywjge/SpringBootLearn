package com.hyperskill.springmvcdemo.repository;

import com.hyperskill.springmvcdemo.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
    Task findByTitle (String title);

}
