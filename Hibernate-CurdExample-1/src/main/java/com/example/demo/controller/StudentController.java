package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentInfo;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentservice;

	@PostMapping(value = "/insert", consumes = { MediaType.APPLICATION_JSON_VALUE },produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<StudentInfo> insertserviceStudent(@RequestBody StudentInfo studentinfo) {
		studentservice.insertStudent(studentinfo);
		return ResponseEntity.status(405).body(studentinfo);
	}

}
