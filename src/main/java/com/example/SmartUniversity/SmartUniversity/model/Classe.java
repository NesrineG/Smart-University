package com.example.SmartUniversity.SmartUniversity.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "classe")
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false , updatable = false)
    private Integer Cid;

    private String c_name;

    @JsonManagedReference
    @OneToMany(mappedBy = "classe" , cascade = CascadeType.ALL)
    private List<Student> students;

}
