package com.example.h2.example.demo.controller;

import com.example.h2.example.demo.entity.Faculty;
import com.example.h2.example.demo.service.FacultyService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

  @Autowired
  FacultyService facultyService;

  @GetMapping("")
  public List<Faculty> fetchFaculties() {
    return facultyService.fetchFaculties();
  }

  @GetMapping("/{facultyId}")
  public Optional<Faculty> fetchFaculty(@PathVariable Long Id) {
    return facultyService.fetchFacultyById(Id);
  }

}
