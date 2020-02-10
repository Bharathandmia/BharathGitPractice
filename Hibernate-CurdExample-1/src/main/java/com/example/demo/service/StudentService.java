package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentInfo;
import com.example.demo.repo.StudentInfoRepo;

@Service
public class StudentService {

	@Autowired
	StudentInfoRepo studentinforrepo;

	public ResponseEntity<StudentInfo> insertStudent(StudentInfo studentinfo) {
		studentinforrepo.save(studentinfo);
		return ResponseEntity.ok().body(studentinfo);

	}

	public void updateStudent(StudentInfo studentinfo) {
		studentinforrepo.save(studentinfo);
	}

	public void deleteStudent(StudentInfo studentinfo) {
		studentinforrepo.delete(studentinfo);
	}

}
