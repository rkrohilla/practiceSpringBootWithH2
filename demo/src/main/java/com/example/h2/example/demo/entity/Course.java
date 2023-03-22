package com.example.h2.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
  @Id
  @GeneratedValue
  private Long Id;
  private String courseName;
  private String courseDescription;

  private Long faculty_id;
}
