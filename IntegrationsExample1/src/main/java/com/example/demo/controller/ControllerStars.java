package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Stars;
import com.example.demo.service.ServiceStars;

@RestController
@RequestMapping("/xvideo")
public class ControllerStars {

	@Autowired
	ServiceStars servicestars;

	@GetMapping(value = "/desi/{id}")

	public Stars getStarsCont(@PathVariable("id") int id) {
		return servicestars.getStars(id);

	}

	@PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Stars insertDataController(@RequestBody Stars stars) {
		return servicestars.insertData(stars);

	}

	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Stars updateDataController(@RequestBody Stars stars) {
		return servicestars.updateData(stars);

	}

}
