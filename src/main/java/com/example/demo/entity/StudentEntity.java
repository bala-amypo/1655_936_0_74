package com.example.demo.entity;

import jakarta.presistance.Entity;
import jakarta.presistance.Id;
import jakrata.presistance.GenerationType;
import jakarta.p
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