package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentDemo;

public interface StudentRepo  extends JpaRepository<StudentDemo, Integer>{

}
