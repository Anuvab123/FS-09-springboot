package com.geekster.simpleApplication.controller;

import org.json.JSONArray;
import org.json.JSONObject;
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
        JSONObject jsonObject=new JSONObject(requestData);
        String name=jsonObject.getString("name");
        String username=jsonObject.getString("username");
        String phno=jsonObject.getString("phn-no");
        System.out.println(name+" "+username+" "+phno);
        return "data saved";
    }

}
