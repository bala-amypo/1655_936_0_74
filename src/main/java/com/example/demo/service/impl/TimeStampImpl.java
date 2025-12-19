package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.entity.TimeStamp;

@Service
public class TimeStampServiceImpl implements TimeStampService{

public TimeStamp postdata(TimeStamp val){


@Autowired TimeStampRepository value;

@Override
    public TimeStamp postdata(TimeStamp valu){
        
        return value.save(valu);

    }

}

}
