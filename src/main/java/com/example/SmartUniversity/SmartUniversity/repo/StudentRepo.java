package com.example.SmartUniversity.SmartUniversity.repo;

import com.example.SmartUniversity.SmartUniversity.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
