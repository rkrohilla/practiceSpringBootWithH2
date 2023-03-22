package com.example.h2.example.demo.service;

import com.example.h2.example.demo.entity.Student;
import com.example.h2.example.demo.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
  @Autowired
  StudentRepository studentRepository;

  public List<Student> fetchAllStudents() {
    return studentRepository.findAll();
  }

  public Student fetchStudentById(String Id) {
    return studentRepository.findAllById(Id);
  }

}
