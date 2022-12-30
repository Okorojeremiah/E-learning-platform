package com.semicolonafrica.elearning.data.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Course {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;
    private String language;

    @ElementCollection
    private List<String> imageUrls;

    @CreationTimestamp
    private LocalDateTime dateCreated;
    private LocalDateTime datePublished;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private boolean isPublished;

    @ManyToOne
    private Instructor instructor;

    @ManyToMany
    private List<Student> students;
}
