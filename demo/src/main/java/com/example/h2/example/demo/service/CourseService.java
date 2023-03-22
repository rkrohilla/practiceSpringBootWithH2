package com.example.h2.example.demo.service;

import com.example.h2.example.demo.entity.Course;
import com.example.h2.example.demo.repository.CourseRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
  @Autowired
  CourseRepository courseRepository;
  private CourseRepository courseRepository1;

  public List<Course> fetchCourses() {
    return courseRepository.findAll();
  }

  public Optional<Course> fetchCourse(Long Id) {
    return courseRepository.findById(Id);
  }

}
