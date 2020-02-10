package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PanCard;

public interface PanCardRepository  extends JpaRepository<PanCard, Integer> {

}
