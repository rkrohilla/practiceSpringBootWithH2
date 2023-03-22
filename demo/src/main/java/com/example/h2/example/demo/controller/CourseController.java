package com.example.h2.example.demo.controller;

import com.example.h2.example.demo.entity.Course;
import com.example.h2.example.demo.service.CourseService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

  @Autowired
  CourseService courseService;
  @GetMapping("/")
  public List<Course> fetchFaculties() {
    return courseService.fetchCourses();
  }
  @GetMapping("/course/{courseId}")
  public Optional<Course> fetchFacultyById(@PathVariable Long Id) {
    return courseService.fetchCourse(Id);
  }

}
