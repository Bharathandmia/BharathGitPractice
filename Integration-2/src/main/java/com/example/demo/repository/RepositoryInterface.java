package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AdharInfo;

public interface RepositoryInterface extends JpaRepository<AdharInfo, Integer> {

}
