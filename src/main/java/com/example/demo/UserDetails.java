package com.example.demo;

import jakarta.persistence.*;
import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@Entity
@Table(name = "UserDetails")
public class UserDetails {

    @Id
    private Long id;

    private String address;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;
}

