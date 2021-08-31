package com.joan.fonseca.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course implements Serializable {

	private static final long serialVersionUID = -767919408382114500L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_course;

	private String classroom;
	private Integer grade;

	private Long id_school;

	public Course() {

	}

	public Course(String classroom, Integer grade, Long id_school) {
		super();
		this.classroom = classroom;
		this.grade = grade;
		this.id_school = id_school;
	}

	/**
	 * setters and getters
	 */
	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Long getId_course() {
		return id_course;
	}

	public Long getId_school() {
		return id_school;
	}

	public void setId_school(Long id_school) {
		this.id_school = id_school;
	}

	@Override
	public String toString() {
		return "Course [id_course=" + id_course + ", classroom=" + classroom + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classroom == null) ? 0 : classroom.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((id_course == null) ? 0 : id_course.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (classroom == null) {
			if (other.classroom != null)
				return false;
		} else if (!classroom.equals(other.classroom))
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (id_course == null) {
			if (other.id_course != null)
				return false;
		} else if (!id_course.equals(other.id_course))
			return false;
		return true;
	}

}