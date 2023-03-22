package com.example.h2.example.demo.repository;

import com.example.h2.example.demo.entity.Student;
import java.util.List;
import java.util.function.Function;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
  Student findAllById(String Id);

}
