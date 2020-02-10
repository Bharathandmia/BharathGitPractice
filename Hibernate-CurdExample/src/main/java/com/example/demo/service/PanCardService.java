package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PanCardRepository;
import com.example.demo.exceptionhandling.IdNotFound;
import com.example.demo.model.PanCard;

@Service
public class PanCardService {

	@Autowired
	PanCardRepository pancardrepository;

	public PanCard getPanCardDetails(int id) {

		return pancardrepository.findById(id).orElseThrow(() -> new IdNotFound("message"));

	}

}
