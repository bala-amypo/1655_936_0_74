package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeStamp{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String email;
private LocalDateTime createdAt;
private LocalDateTime UpdateAt;

@PrePersist

public void Oncreate(){

    LocalDateTime now =new LocalDateTime().now();
    this.createdAt=now;
    this.UpdateAt=now;
}

@PreUpdate()

public void Onupdate(){
 LocalDateTime now =new LocalDateTime().now();
 this.UpdateAt=now;

}



}