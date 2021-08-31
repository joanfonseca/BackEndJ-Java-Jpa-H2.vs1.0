package com.joan.fonseca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.joan.fonseca.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}