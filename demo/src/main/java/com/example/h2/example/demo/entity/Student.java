package com.example.h2.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Student {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String passportNumber;

  private Long course_id;
}

