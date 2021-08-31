package com.joan.fonseca.service;

import java.util.Optional;
import com.joan.fonseca.entity.Subject;

public interface SubjectService {
	public Iterable<Subject> findAll();

	public Optional<Subject> findById(Long id);

	public Subject save(Subject subject);

	public void deleteById(Long id);
}