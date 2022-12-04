package com.example.SmartUniversity.SmartUniversity.service;

import com.example.SmartUniversity.SmartUniversity.Exception.UserNotFoundException;
import com.example.SmartUniversity.SmartUniversity.model.Student;
import com.example.SmartUniversity.SmartUniversity.repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    //Add a Student
    public Student addStudent(Student student){

        return studentRepo.save(student);
    }

    //Find all the students
    public List<Student> findAllStudents(){
        return studentRepo.findAll();
    }

    //Find a Student ById
    public Student findStudentById(Integer id)  {
        return studentRepo.findById(id).orElseThrow(()-> new UserNotFoundException("Student with Id" + id + "" + "not found"));
    }

    //Delete a Student ById
    public void deleteStudent(Integer id){
        studentRepo.deleteById(id);
    }

    //Update a Student
    public Student updateStudent(Student student){
        return studentRepo.save(student);
    }
}
