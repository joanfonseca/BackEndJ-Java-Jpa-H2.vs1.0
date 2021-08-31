package com.joan.fonseca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.joan.fonseca.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	@Query(value = "Select  name_student, name_subject, concat( grade,' ',classroom)from students,subjects,materias, courses where students.id_student =:id_student and students.id_student = materias.id_student and materias.id_subject = subjects.id_subject and courses.id_course=subjects.id_course;", nativeQuery = true)
	List<?> getSubjectForStudent(@Param("id_student")Long id_student);
}