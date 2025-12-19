package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TimeStamp;
@Repository
public class TimeStampRepository extends JpaRepository<TimeStamp,Long>{


}