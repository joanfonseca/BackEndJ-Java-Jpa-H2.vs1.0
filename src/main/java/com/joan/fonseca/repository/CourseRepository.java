package com.joan.fonseca.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.joan.fonseca.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
	@Query(value = "select * from courses, schools where courses.id_school=:id_school  and courses.id_school=schools.id_school;", nativeQuery = true)
	public List<?> getCuoursesToSchool(Long id_school);
}