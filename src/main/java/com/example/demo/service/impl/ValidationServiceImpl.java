package com.example.demo.service.impl;

import com.example.demo.service.ValidationService;
import org.springframework.stereotype.Service;
@Service
public class ValidationServiceImpl implements ValidationService{

@Autowired ValidationRepository value;

@Override
    public ValidationEntity postdata(ValidationEntity stu){
        
        return value.save(stu);

    }

}