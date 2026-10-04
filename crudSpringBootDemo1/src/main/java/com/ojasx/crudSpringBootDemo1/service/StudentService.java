package com.ojasx.crudSpringBootDemo1.service;

import com.ojasx.crudSpringBootDemo1.entitiy.student;
import com.ojasx.crudSpringBootDemo1.repository.StudentRepository;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    private studentRepository studentRepository;
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public student createstudent(student studentreq){

    }


}
