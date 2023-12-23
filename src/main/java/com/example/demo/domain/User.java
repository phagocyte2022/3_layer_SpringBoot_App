package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name = "demo_users")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RestController
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;

}
