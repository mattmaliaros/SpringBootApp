package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
        StudentRepository repository) {

    return args -> {
        Student matt = new Student(1L, "Matt", "mattmillz@gmail.com", 27, LocalDate.of(1993, 10, 21));
        Student alex = new Student("Alex", "alex@gmail.com", 27, LocalDate.of(1994, 11, 11));

        repository.saveAll(List.of(matt, alex));
    };
}
}
