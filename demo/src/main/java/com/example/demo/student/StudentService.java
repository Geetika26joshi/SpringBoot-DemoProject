package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Rohan",

                        LocalDate.of(1995, Month.JANUARY,5),
                        "Rohan2590@gmail.com",
                        26

                ),
                new Student(
                        2L,
                        "Nidhi",
                        LocalDate.of(1990,Month.MAY,30),
                        "Nidhi5858@yahoo.com",
                        31

                )
        );

    }
}
