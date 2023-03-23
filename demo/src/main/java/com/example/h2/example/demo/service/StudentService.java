package com.example.h2.example.demo.service;

import com.example.h2.example.demo.dto.StudentDTO;
import com.example.h2.example.demo.entity.Student;
import com.example.h2.example.demo.repository.StudentRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
  @Autowired
  StudentRepository studentRepository;

  public StudentDTO fetchAllStudents() {
    List<Student> result = studentRepository.findAll();
    StudentDTO students = new StudentDTO();
    List<String> names = new ArrayList<>();
    for (Student std : result) {
      names.add(std.getName());
    }
    students.setNames(names);
    return students;
  }

  public Student fetchStudentById(String Id) {
    return studentRepository.findAllById(Id);
  }

}
