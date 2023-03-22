package com.example.h2.example.demo.service;

import com.example.h2.example.demo.entity.Faculty;
import com.example.h2.example.demo.repository.FacultyRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {

  @Autowired
  FacultyRepository facultyRepository;

  public List<Faculty> fetchFaculties() {
    return facultyRepository.findAll();
  }

  public Optional<Faculty> fetchFacultyById(Long Id) {
    return facultyRepository.findById(Id);
  }

}
