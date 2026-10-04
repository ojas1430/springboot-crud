package com.ojasx.crudSpringBootDemo1.controller;

import com.ojasx.crudSpringBootDemo1.entitiy.student;
import com.ojasx.crudSpringBootDemo1.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class studentController {

    private StudentService studentService;
    public studentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public String createStudent(@RequestBody student student){
        System.out.println(student.getName());
        System.out.println(student.getEmail());
        student createdStudent = studentService.createStudent(student);
        return "Student Created";
    }

    //Read Student


}
