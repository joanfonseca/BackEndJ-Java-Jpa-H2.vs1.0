package com.joan.fonseca.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joan.fonseca.entity.Teacher;
import com.joan.fonseca.repository.TeacherRepository;

@Service
public class TeacherServiceImp implements TeacherService {

	@Autowired
	private TeacherRepository teacherRep;

	@Override
	public Iterable<Teacher> findAll() {
		return teacherRep.findAll();
	}

	@Override
	public Optional<Teacher> findById(Long id) {
		return teacherRep.findById(id);
	}

	@Override
	public Teacher save(Teacher teacher) {
		return teacherRep.save(teacher);
	}

	@Override
	public void deleteById(Long id) {
		teacherRep.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Object> findBySubjectByIdTeacherAndSchool(Long id_teacher1) {
		return teacherRep.findBySubjectByIdTeacherAndSchool(id_teacher1);
	}
}