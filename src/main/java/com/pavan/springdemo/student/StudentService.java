package com.pavan.springdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
public List<Student> findAllStudents(){
        
        return List.of(
            new Student("Pavan" , "Hampi", LocalDate.now(), "p1@gmail.com",36),
            new Student("Student2", "Dholya", LocalDate.now(),"abc@gmail.com", 50),
            new Student("Student3", "Hampi", LocalDate.now(), "pooja@gmail.com", 30)
        );   
    }
    
}
