package com.example.demo.entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.OneToOne;
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentIdDetails{


  @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String idcardnumber;
    private Integer student_id;
 @OneToOne
@JoinColumn(name="student_id")
private StudentDetails student;


}