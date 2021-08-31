package com.joan.fonseca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.joan.fonseca.entity.Course;

public interface CourseService {
	public Iterable<Course> findAll();

	public Optional<Course> findById(Long id);

	public Course save(Course course);

	public void deleteById(Long id);
	
	@Query(value = "select * from courses, schools where courses.id_school=:id_school  and courses.id_school=schools.id_school;", nativeQuery = true)
	public List<?> getCuoursesToSchool(Long id_school);
}