package com.geekster.simpleApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping(value = "/student")
    public String getStudent(){
        return "This is the information about student";
    }
}
