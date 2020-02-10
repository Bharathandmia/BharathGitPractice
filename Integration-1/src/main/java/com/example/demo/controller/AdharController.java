package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AdharInfo;
import com.example.demo.repository.RepositiryClass;

@RestController

@RequestMapping("/adhar")
public class AdharController {

	@Autowired(required=true)
	RepositiryClass repositiryclass;
	
	@PostMapping(value="/insert",consumes= {MediaType.APPLICATION_JSON_VALUE})
	public void insertDataController(@RequestBody AdharInfo adharinfo)
	{
		repositiryclass.insertData(adharinfo);
		
	}
	
	
	

}
