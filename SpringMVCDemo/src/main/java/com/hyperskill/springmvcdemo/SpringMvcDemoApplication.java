package com.hyperskill.springmvcdemo;

import com.hyperskill.springmvcdemo.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMvcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runApplication(TaskRepository taskRepository) {
        return (args -> {

        });
    }
}
