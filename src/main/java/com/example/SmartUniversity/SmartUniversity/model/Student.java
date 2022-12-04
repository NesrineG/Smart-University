package com.example.SmartUniversity.SmartUniversity.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false , updatable = false)
    private Integer id;

    private String phoneNumber;

    private String name;

    private String email;

    private String password;

    @JsonBackReference
    @ManyToOne
    private Classe classe;
}
