package com.example.demo.entity;

import jakarta.presistance.Entity;
import jakarta.presistance.Id;
import jakrata.presistance.GenerationType;
import jakarta.presistance.GeneratedValue;
@Entity
public class StudentEntity(){

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Integer id;
private String name;
private String email;
private String password;
private Date created;

}
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
    this.password=name;
}