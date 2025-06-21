package com.example.studentapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
                new Student(1, "Ahmad"),
                new Student(2, "Ajmal")
        );
    }
}
