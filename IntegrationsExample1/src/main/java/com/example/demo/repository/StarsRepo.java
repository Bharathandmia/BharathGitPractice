package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Stars;

public interface StarsRepo extends JpaRepository<Stars, Integer> {

}
