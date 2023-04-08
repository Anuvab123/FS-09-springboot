package com.geekster.simpleApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @GetMapping(value = "/cat")
    public String getCatInfo(){
        return "This is the information about cat";
    }

    @PostMapping(value="/cat")
    public String saveCat(@RequestBody String requestData){
        System.out.println(requestData);
        return "data saved";
    }

}
