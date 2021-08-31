package com.joan.fonseca.service;

import java.util.Optional;
import com.joan.fonseca.entity.School;

public interface SchoolService {

	public Iterable<School> findAll();

	public Optional<School> findById(Long id);

	public School save(School school);

	public void deleteById(Long id);
}