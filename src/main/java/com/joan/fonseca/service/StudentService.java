package com.joan.fonseca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.joan.fonseca.entity.Student;

public interface StudentService {
	public Iterable<Student> findAll();

	public Optional<Student> findById(Long id);

	public Student save(Student student);

	public void deleteById(Long id);
	
	@Query(value = "Select  name_student, name_subject, concat( grade,' ',classroom)from students,subjects,materias, courses where students.id_student =:id_student and students.id_student = materias.id_student and materias.id_subject = subjects.id_subject and courses.id_course=subjects.id_course;", nativeQuery = true)
	public List<?> getSubjectForStudent(Long id_student);
}