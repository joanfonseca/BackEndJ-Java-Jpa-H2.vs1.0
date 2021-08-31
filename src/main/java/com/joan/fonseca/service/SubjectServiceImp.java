package com.joan.fonseca.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.joan.fonseca.entity.Subject;
import com.joan.fonseca.repository.SubjectRepository;

@Service
public class SubjectServiceImp implements SubjectService {

	@Autowired
	private SubjectRepository subjectRep;

	@Override
	public Iterable<Subject> findAll() {
		return subjectRep.findAll();
	}

	@Override
	public Optional<Subject> findById(Long id) {
		return subjectRep.findById(id);
	}

	@Override
	public Subject save(Subject subject) {
		return subjectRep.save(subject);
	}

	@Override
	public void deleteById(Long id) {
		subjectRep.deleteById(id);
	}
}