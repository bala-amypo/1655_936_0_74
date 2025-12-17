package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import 
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class StudentServiceImpl implements StudentService{

@Autowired StudentRepository student;
//save()
//findAll()
//findById()
//deleteById()
//existsById()
@Override
    public StudentEntity postdata(StudentEntity stu){
        
        return student.return.save(stu);

    }
}