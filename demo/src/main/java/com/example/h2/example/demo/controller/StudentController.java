package com.example.h2.example.demo.controller;

import com.example.h2.example.demo.dto.StudentDTO;
import com.example.h2.example.demo.entity.Student;
import com.example.h2.example.demo.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readers")
public class StudentController {

  @Autowired
  StudentService studentService;
  @GetMapping("/students")
  public StudentDTO retrieveStudents() {
    return studentService.fetchAllStudents();
  }

//  @GetMapping("/students/{studentId}/courses")
//  public List<Course> retrieveCourseByStudent(@PathVariable String studentId) {
//    return studentService.retrieveCoursesByStudentId(studentId);
//  }

  @GetMapping("/students/{studentId}")
  public Student retrieveStudent(@PathVariable String studentId) {
    return studentService.fetchStudentById(studentId);
  }

  // For post request, go to postman -> Body -> raw (json/application) and add below
  // {
  //    "id": "105",
  //    "name": "Java Spring boot and microservices",
  //    "description": "java course",
  //    "steps": ["1st step", "2nd step"]
  //}
//  @PostMapping("/students/{studentId}/course")
//  public String addCourseToStudent(@PathVariable String studentId, @RequestBody Course course) {
//    return studentService.addCourseToStudent(studentId, course);
//  }

}

