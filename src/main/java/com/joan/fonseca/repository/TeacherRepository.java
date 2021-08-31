package com.joan.fonseca.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.joan.fonseca.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
	@Query(value = "select teachers.name_teacher, subjects.name_subject, concat(courses.grade,' ',courses.classroom),subjects.id_subject from subjects,teachers, courses,schools  where teachers.id_teacher= :id_teacher1 and teachers.id_teacher = subjects.id_teacher and subjects.id_course=courses.id_course and schools.id_school=courses.id_school;", nativeQuery = true)
	List<Object> findBySubjectByIdTeacherAndSchool(@Param("id_teacher1") Long id_teacher1);
}