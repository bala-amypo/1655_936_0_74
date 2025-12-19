package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.entity.TimeStamp;

@Service
public class TimeStampServiceImpl implements TimeStampService{

@Autowired TimeStampRepository valu;

@Override
    public TimeStamp postdata(TimeStamp val){
        
        return valu.save(val);

    }

}


