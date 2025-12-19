package com.example.demo.service;

import com.example.demo.entity.StudentDetails;
public interface StudentService{

StudentEntity postdata(StudentEntity stu);

 List<StudentEntity> getAllData();
 
 String deleteData(int id);

 StudentEntity getData(int id);

 StudentEntity updateData(int id,StudentEntity entity);

}