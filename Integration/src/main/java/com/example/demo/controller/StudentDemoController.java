package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentDemo;
import com.example.demo.service.StudentServiceClass;

@RestController
@RequestMapping("/student")
public class StudentDemoController {

	@Autowired
	StudentServiceClass studentserviceclass;

	@RequestMapping(value = "/findall")
	public List<StudentDemo> getStudentsController() {
		return studentserviceclass.getStudents();

	}

	@PostMapping(value = "/save", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public void postmap(@RequestBody StudentDemo studentdemo) {
		studentserviceclass.saveObject(studentdemo);

	}

	@GetMapping(value = "/findallbyid/{id}")
	public Optional<StudentDemo> getByidCont(@PathVariable("id") int id) {
		return studentserviceclass.getByid(id);

	}

	@PutMapping(value = "/update", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public StudentDemo updateCont(@RequestBody StudentDemo studentdemo) {

		return studentserviceclass.updateser(studentdemo);

	}
	
	
	@DeleteMapping(value="/delete/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void deletebyidCont(@PathVariable("id")int id)
	{
		studentserviceclass.deleteByidSer(id);
		
	}
	
	

}
