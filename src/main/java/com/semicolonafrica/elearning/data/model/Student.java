package com.semicolonafrica.elearning.data.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Student {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate date;


    @Enumerated(EnumType.STRING)
    private Gender gender;


    @OneToOne
    private LearningParty LearningParty;



    @ManyToMany
    private List<Course> enrolledCourses;

}
