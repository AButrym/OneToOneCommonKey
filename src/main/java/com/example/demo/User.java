package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserDetails userDetails;
}

