package com.semicolonafrica.elearning.data.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Authority {

    @jakarta.persistence.Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    private Role authority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Authority(Role role){
        this.authority = role;
    }

}
