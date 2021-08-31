package com.joan.fonseca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joan.fonseca.service.StudentService;
import com.joan.fonseca.util.Message;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studenService;
	@GetMapping
	public ResponseEntity<?> all() {
		return ResponseEntity.status(HttpStatus.OK).body(studenService.findAll());
	}

	@GetMapping("/{id_student}")
	public ResponseEntity<?> all(@PathVariable(value = "id_student") Long id_student) {
		List<?> oTeacher = studenService.getSubjectForStudent(id_student);
		if (!oTeacher.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).body(oTeacher);
		} else {
			return new ResponseEntity<Object>(new Message("No student record found."),
					HttpStatus.CONFLICT);
		}
	}
}