package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentDetails;
import com.example.demo.service.StudentDetailsService;

@RestController
public class StudentDetailsController {

    @Autowired
    private StudentDetailsService ser;

    @PostMapping("/post6")
    public StudentDetails sendData(@RequestBody StudentDetails stu) {
        return ser.postdata(stu);
    }
}
