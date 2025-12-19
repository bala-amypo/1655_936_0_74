package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentEntity;
import java.util.List;

@Service
public class StudentIdDetailsServiceImpl implements StudentIdDetailsService{
@Autowired StudentIdDetailsRepository student;
@Override
public StudentIdDetails postdata(StudentIdDetails stu){

     return student.save(stu);
}
}