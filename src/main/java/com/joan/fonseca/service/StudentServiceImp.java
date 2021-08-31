package com.joan.fonseca.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.joan.fonseca.entity.Student;
import com.joan.fonseca.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository studentRep;

	@Override
	public Iterable<Student> findAll() {
		return studentRep.findAll();
	}

	@Override
	public Optional<Student> findById(Long id) {
		return studentRep.findById(id);
	}

	@Override
	public Student save(Student student) {
		return studentRep.save(student);
	}

	@Override
	public void deleteById(Long id) {
		studentRep.deleteById(id);
	}
	
	@Override
	public List<?> getSubjectForStudent(Long id_student) {
		return studentRep.getSubjectForStudent(id_student);
	}
}