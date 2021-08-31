package com.joan.fonseca.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joan.fonseca.entity.Teacher;
import com.joan.fonseca.service.TeacherService;
import com.joan.fonseca.util.Message;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	TeacherService teacherService;

	@PostMapping
	public ResponseEntity<?> newCourse(@RequestBody Teacher teacher) {
		return ResponseEntity.status(HttpStatus.CREATED).body(teacherService.save(teacher));
	}

	@GetMapping
	public ResponseEntity<?> all() {
		return ResponseEntity.status(HttpStatus.OK).body(teacherService.findAll());
	}

	@PostMapping("/{id_teacher}")
	public ResponseEntity<?> all(@PathVariable(value = "id_teacher") Long id_teacher) {
		List<Object> oTeacher = teacherService.findBySubjectByIdTeacherAndSchool(id_teacher);
		if (!oTeacher.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).body(oTeacher);
		} else {
			return new ResponseEntity<Object>(new Message("No teacher record found."), HttpStatus.CONFLICT);
		}
	}
}