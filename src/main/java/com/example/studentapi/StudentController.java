package com.example.studentapi;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Ahmad"),
            new Student(2, "Ajmal")
    ));

    // GET all students
    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        System.out.println("Received student: " + student.getName());
        students.add(student);  // Add new student to list
        return student;
    }
}
