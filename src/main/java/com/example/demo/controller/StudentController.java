package com.example.demo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class StudentController{

@Autowired StudentService ser;
@PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
            return ser.postdata(stu);
}
@GetMapping("/get")
public List<StudentEntity> getdata(){
    return ser.getAllData();
}

@DeleteMapping("/delete/{id}")
 public String DeleteData(@PathVariable int id){
   return ser.deleteData();
 }

}