package com.semicolonafrica.elearning.data.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(nullable = false)
    private String firstname;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(nullable = false)
    private String lastname;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String specialization;

    @Column(length =1000)
    private String bio;

    @OneToOne(cascade = CascadeType.PERSIST)
    private LearningParty learningParty;

    @OneToMany
    private List<Course> courses;
}
