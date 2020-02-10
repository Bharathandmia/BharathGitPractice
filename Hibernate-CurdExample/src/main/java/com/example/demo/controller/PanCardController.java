package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PanCard;
import com.example.demo.service.PanCardService;


@RequestMapping("/pancard")
@RestController
public class PanCardController {

	@Autowired
	PanCardService pancardservice;
    @GetMapping(value="/id/{id}")
	public PanCard getPanCardDetailsController(@PathVariable 
			("id")int id) {
		return pancardservice.getPanCardDetails(id);

	}

}
