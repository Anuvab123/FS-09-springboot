package com.geekster.simpleApplication.controller;

import com.geekster.simpleApplication.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping(value = "/student")
    public String getStudent(){
        return "This is the information about student";
    }

    @PostMapping(value="/student")
    public String saveStudent(@RequestBody Student studentObj){
        System.out.println(studentObj.getStudentId());
        System.out.println(studentObj.getFirstName());
        System.out.println(studentObj.getLastName());
        return "student data saved";
    }
}
