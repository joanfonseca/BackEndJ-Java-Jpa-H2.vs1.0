package com.joan.fonseca.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joan.fonseca.entity.School;
import com.joan.fonseca.service.SchoolService;
import com.joan.fonseca.util.Message;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/school")
public class SchoolController {

	@Autowired
	SchoolService schoolRep;

	@GetMapping
	public ResponseEntity<?> all() {
		return ResponseEntity.status(HttpStatus.OK).body(schoolRep.findAll());
	}

	@GetMapping("/{id_school}")
	public ResponseEntity<?> findById(@PathVariable(value = "id_school") Long id_school) {
		Optional<School> oSchool = schoolRep.findById(id_school);
		if (oSchool.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(schoolRep.findById(id_school));

		} else {
			return new ResponseEntity<Object>(new Message("No found school."),
					HttpStatus.CONFLICT);
		}
	}
}