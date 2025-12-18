package com.example.demo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
@RestController
public class ValidationController{
    
@Autowired ValidationService val;
@PostMapping("/post")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity value){
            return val.postdata(value);
}

}
