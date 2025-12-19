package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentDetails;
import java.util.List;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService{
@Autowired StudentDetailsRepository student;
@Override
public StudentDetails postdata(StudentDetails stu){

     return student.save(stu);
}
}