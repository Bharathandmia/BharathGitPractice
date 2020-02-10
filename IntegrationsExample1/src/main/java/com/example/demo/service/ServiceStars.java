package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exceptionhandling.UserDefinedException;
import com.example.demo.model.Stars;
import com.example.demo.repository.StarsRepo;

@Service
public class ServiceStars {

	@Autowired
	StarsRepo starsrepo;

	public Stars getStars(int id) {
		return starsrepo.findById(id).orElseThrow(() -> new UserDefinedException(id));

		// starsrepo.findById(id);

	}

	public Stars insertData(Stars stars) {
		return starsrepo.save(stars);

	}

	public Stars updateData(Stars stars) {
		return starsrepo.save(stars);

	}

}
