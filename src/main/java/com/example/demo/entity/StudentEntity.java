package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created;
  
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name=name;
    }

    public Integer getId(){
        return id;
    }
    public String setId(Integer id){
        this.id=id;
    }

    public String getEmail(){
        return email;
    }
    public String setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public String setPassword(String password){
        this.password=password;
    }
    public Date getCreated(){
        return created;
    }
    public Date setCreated(Date created){
        this.created=created;
    }
}
  public StudentEntity(String name,Integer id,String email,String password,Date created){
        this.name=name;
        this.id=id;
        this.email=email;
        this.password=password;
        this.created=created;
    }
        
    public StudentEntity(){
    }

