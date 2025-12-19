package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentIdDetails;
import com.example.demo.service.StudentIdDetailsService;

@RestController
public class StudentIdDetailsController {

    @Autowired
    private StudentIdDetailsService ser;

    @PostMapping("/post7")
    public StudentIdDetails sendData(@RequestBody StudentIdDetails stu) {
        return ser.postdata(stu);
    }
}
