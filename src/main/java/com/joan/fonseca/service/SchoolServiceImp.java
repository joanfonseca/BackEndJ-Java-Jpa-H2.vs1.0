package com.joan.fonseca.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.joan.fonseca.entity.School;
import com.joan.fonseca.repository.SchoolRepository;

@Service
public class SchoolServiceImp implements SchoolService {

	@Autowired
	private SchoolRepository schoolRep;

	@Override
	public Iterable<School> findAll() {
		return schoolRep.findAll();
	}

	@Override
	public Optional<School> findById(Long id) {
		return schoolRep.findById(id);
	}

	@Override
	public School save(School school) {
		return schoolRep.save(school);
	}

	@Override
	public void deleteById(Long id) {
		schoolRep.deleteById(id);
	}
}