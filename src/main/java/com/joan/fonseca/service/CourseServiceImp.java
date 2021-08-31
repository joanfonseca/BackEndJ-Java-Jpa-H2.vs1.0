package com.joan.fonseca.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joan.fonseca.entity.Course;
import com.joan.fonseca.repository.CourseRepository;

@Service
public class CourseServiceImp implements CourseService {

	@Autowired
	private CourseRepository courseRep;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Course> findAll() {
		return courseRep.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Course> findById(Long id) {
		return courseRep.findById(id);
	}

	@Override
	public Course save(Course course) {
		return courseRep.save(course);
	}

	@Override
	public void deleteById(Long id) {
		courseRep.deleteById(id);
	}

	@Override
	public List<?> getCuoursesToSchool(Long id_school) {
		return courseRep.getCuoursesToSchool(id_school);
	}
}