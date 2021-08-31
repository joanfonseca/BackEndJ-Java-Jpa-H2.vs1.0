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

import com.joan.fonseca.service.CourseService;
import com.joan.fonseca.util.Message;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@GetMapping
	public ResponseEntity<?> all() {
		return ResponseEntity.status(HttpStatus.OK).body(courseService.findAll());
	}
	//Traelos cursos de un colegio
	@GetMapping("/course/{id_school}")
	public ResponseEntity<?> all(@PathVariable(value = "id_school") Long id_school) {
		List<?> list = courseService.getCuoursesToSchool(id_school);
		if (!list.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).body(list);

		} else {
			return new ResponseEntity<Object>(new Message("No student record found."),
					HttpStatus.CONFLICT);
		}
	}
}