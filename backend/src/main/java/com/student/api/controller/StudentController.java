package com.student.api.controller;

import com.student.api.model.Student;
import com.student.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:5174")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:5174")
    public Student addStudent(@RequestBody Student student) {
        System.out.println(student.getName());
        return studentRepository.save(student);
    }
}