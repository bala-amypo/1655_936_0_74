package com.example.demo.entity;

public class StudentDetails{

 @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String address;


}