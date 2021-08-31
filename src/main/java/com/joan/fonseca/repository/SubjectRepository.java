package com.joan.fonseca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.joan.fonseca.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}