package com.joan.fonseca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.joan.fonseca.entity.Teacher;

public interface TeacherService {
	public Iterable<Teacher> findAll();

	public Optional<Teacher> findById(Long id);

	public Teacher save(Teacher teacher);

	public void deleteById(Long id);
	@Query(value = "select teachers.name_teacher, subjects.name_subject, concat(courses.grade,' ',courses.classroom),subjects.id_subject from subjects,teachers, courses,schools  where teachers.id_teacher= :id_teacher1 and teachers.id_teacher = subjects.id_teacher and subjects.id_course=courses.id_course and schools.id_school=courses.id_school;", nativeQuery = true)
	public List<Object> findBySubjectByIdTeacherAndSchool(Long id_teacher1);
}