package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentDemo;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentServiceClass {

	@Autowired
	StudentRepo studentrepo;

	public List<StudentDemo> getStudents() {

		return studentrepo.findAll();
	}

	public void saveObject(StudentDemo studentdemo) {

		studentrepo.save(studentdemo);

	}

	public Optional<StudentDemo> getByid(int id) {
		return studentrepo.findById(id);

	}

	public StudentDemo updateser(StudentDemo studentdemo)
	{
		return studentrepo.save(studentdemo);
	}
	
	
	public void deleteByidSer(int id)
	{
		
		studentrepo.deleteById(id);
	}
	
	
}
