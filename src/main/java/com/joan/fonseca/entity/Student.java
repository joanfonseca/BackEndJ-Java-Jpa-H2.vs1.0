package com.joan.fonseca.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student implements Serializable {
	private static final long serialVersionUID = 2993223140163697001L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_student;

	private String name_student;

	public Student() {

	}

	public Student(String name) {
		super();
		this.name_student = name;
	}

	/**
	 * setters and getters
	 */

	public String getName() {
		return name_student;
	}

	public void setName(String name) {
		this.name_student = name;
	}

	public Long getId_student() {
		return id_student;
	}

	@Override
	public String toString() {
		return "Student [id_student=" + id_student + ", name=" + name_student + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_student == null) ? 0 : id_student.hashCode());
		result = prime * result + ((name_student == null) ? 0 : name_student.hashCode());
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
		Student other = (Student) obj;
		if (id_student == null) {
			if (other.id_student != null)
				return false;
		} else if (!id_student.equals(other.id_student))
			return false;
		if (name_student == null) {
			if (other.name_student != null)
				return false;
		} else if (!name_student.equals(other.name_student))
			return false;
		return true;
	}
}